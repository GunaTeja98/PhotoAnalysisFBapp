package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;




public class getData extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        super.doGet(request,response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        DatastoreService ds= DatastoreServiceFactory.getDatastoreService();
        InputStream inStream = request.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        String resultxml = new String(outSteam.toByteArray(), "utf-8");

        //Json parsing

        JSONObject jsonObject = JSON.parseObject(resultxml);
        String user_id = jsonObject.getString("id");
        //System.out.println(user_id);
        JSONObject albums = jsonObject.getJSONObject("albums");
        JSONArray album_array = albums.getJSONArray("data");
        JSONObject mobile_albums = album_array.getJSONObject(0);
        JSONObject mobile_albums_photos = mobile_albums.getJSONObject("photos");
        JSONArray photo_array = mobile_albums_photos.getJSONArray("data");

        String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss+SSSS";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

        for (int i=0; i<photo_array.size();i++)
        {
            JSONObject o = photo_array.getJSONObject(i);

            String created_time = o.getString("created_time");
            Date created_date = null;
            try {
                created_date = sdf.parse(created_time);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            JSONArray images = o.getJSONArray("images");
            JSONObject image1= images.getJSONObject(0);
            String image1_url = image1.getString("source");
            String image1_id = o.getString("id");
            Integer likes = o.getJSONObject("likes").getJSONObject("summary").getInteger("total_count");
            //System.out.println(created_time+"\n"+image1_url+"\n"+image1_id+"\n"+likes+"\n\n");

            Entity photo = new Entity("photo", image1_id);

            photo.setProperty("created_time",created_date);
            photo.setProperty("image_url", image1_url);
            photo.setProperty("likes",likes);
            photo.setProperty("image_id", image1_id);
            photo.setProperty("user_id",user_id);

            ds.put(photo);
        }
        //output success log
        System.out.println("Fetch photos successfully!");

        //close Steam
        outSteam.close();
        inStream.close();

    }

}
