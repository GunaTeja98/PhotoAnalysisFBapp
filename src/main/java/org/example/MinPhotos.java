package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

@WebServlet(
        name = "MinPhotos",
        urlPatterns = "/minPhotos"
)
public class MinPhotos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
        String date_range=req.getParameter("date");
        String[] s1=date_range.split(" - ");
        String user_id = req.getParameter("id");
        String from_date = s1[0];
        String to_date = s1[1];
        System.out.println(from_date+" "+to_date);
        String DATE_FORMAT = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        Date from_d = null;
        Date to_d = null;
        try {
            from_d = sdf.parse(from_date);
            to_d = sdf.parse(to_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long unlikePhoto = 0;

        Filter propertyFilter = new FilterPredicate("likes", FilterOperator.EQUAL, unlikePhoto);
        Filter fromFilter = new FilterPredicate("created_time",FilterOperator.GREATER_THAN_OR_EQUAL, from_d);
        Filter toFilter = new FilterPredicate("created_time", FilterOperator.LESS_THAN_OR_EQUAL, to_d);
        Filter userFilter = new FilterPredicate("user_id", FilterOperator.EQUAL, user_id);

        Filter dateFilter = Query.CompositeFilterOperator.and(fromFilter,toFilter);

        Query query_property = new Query("photo").setFilter(propertyFilter);
        List<Entity> photo = ds.prepare(query_property).asList(FetchOptions.Builder.withLimit(30));
        Query query_date = new Query("photo").setFilter(dateFilter);
        List<Entity> photo_date = ds.prepare(query_date).asList(FetchOptions.Builder.withLimit(30));
        Query query_user = new Query("photo").setFilter(userFilter);
        List<Entity> photo_user = ds.prepare(query_user).asList(FetchOptions.Builder.withLimit(30));

        photo.retainAll(photo_date);
        photo.retainAll(photo_user);

        req.setAttribute("photo", photo);
        req.getRequestDispatcher("minPhotos.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
