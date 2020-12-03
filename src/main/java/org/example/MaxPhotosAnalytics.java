package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.EntityAnnotation;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Feature.Type;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.protobuf.ByteString;

public class MaxPhotosAnalytics extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        InputStream inStream = req.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        String result = new String(outSteam.toByteArray(), "utf-8");
        InputStream imageStream = getImageStream(result);

        String s = imageStream.toString();

        List<String> img_description = new ArrayList<String>();

        img_description.add(s);
        img_description.add("123");

        String str = img_description.toString();
        resp.getWriter().write(str);
        */

//        req.setAttribute("img_description", img_description);
//        req.getRequestDispatcher("maxPhotosAnalytics.jsp").forward(req,resp);


        InputStream inStream = req.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        String result = new String(outSteam.toByteArray(), "utf-8");
        InputStream imageStream = getImageStream(result);

        ByteString imageBytes = ByteString.readFrom(imageStream);
        Image image = Image.newBuilder().setContent(imageBytes).build();
        Feature feature = Feature.newBuilder().setType(Type.LABEL_DETECTION).build();
        AnnotateImageRequest requestAnnotate =
                AnnotateImageRequest.newBuilder().addFeatures(feature).setImage(image).build();
        List<AnnotateImageRequest> requests = new ArrayList<>();
        requests.add(requestAnnotate);

        ImageAnnotatorClient client = ImageAnnotatorClient.create();
        BatchAnnotateImagesResponse batchResponse = client.batchAnnotateImages(requests);
        List<AnnotateImageResponse> imageResponses = batchResponse.getResponsesList();

        List<String> img_description = new ArrayList<String>();


        for (AnnotateImageResponse res : imageResponses) {
            if (res.hasError()) {
                System.out.printf("Error: %s\n", res.getError().getMessage());
                return;
            }


            for (EntityAnnotation annotation : res.getLabelAnnotationsList()) {
                img_description.add(annotation.getDescription());
            }
        }

        StringBuilder responseTags = new StringBuilder();
        for (int i=0;i<5;i++)
        {
            responseTags.append(" "+img_description.get(i)+", ");
        }
        String analysis = responseTags.toString();
        resp.getWriter().write(analysis);



        /*
        for (int i=0;i<img_description.size();i++)
        {
            responseTags.append("<span>"+img_description.get(i)+" ," +"</span>");
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!doctype html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "    <title>Max Photos Analytics</title>\n" +
                        "</head>"+
                        "<body style=\"background-color:rgb(241, 245, 245);font-size: 20px;\"><center>\n" +
                        "<p>Based on your analysis, you should take more photos which have "+
                        responseTags+
                        "in them.</p>"+
                        "<p>\n" +
                        "This will help you get more likes on photos uploaded and eventually\n" +
                        "get more reach in social network.\n" +
                        "</p>"+
                        "</body>\n" +
                        "</html>"
                );

         */

    }

    private InputStream getImageStream(String image_url)
    {
        try {
            HttpURLConnection connection = (HttpURLConnection)new URL(image_url).openConnection();
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
                InputStream inputStream = connection.getInputStream();
                return inputStream;
            }
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
