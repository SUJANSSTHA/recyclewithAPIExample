package com.example.recyclewithapiexample;

import android.app.DownloadManager;
import android.content.Context;
import android.view.PixelCopy;

import java.util.ArrayList;
import com.android.volley.RequestQueue;

import org.json.JSONArray;

public class DataLayer {
    Context context;

    public DataLayer(Context context) {
        this.context = context;
    }
    public ArrayList<Contact>getData(){
        ArrayList<Contact> list = new ArrayList<Contact>();
        //write code to fetch api data from api server
        RequestQueue queue = Volley.newRequestQueue(context);
        JSONArrayRequest request = new JSONArrayRequest(Request.Method.GET,"http://10.0.0.2/api/Contact",null,new R){

        };



        queue.add(request);
        return  list;
    }
}
