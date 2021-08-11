package com.agiliatech.android.task101.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.agiliatech.android.task101.R;
import com.agiliatech.android.task101.ui.dashboard.DashboardViewModel;
import com.agiliatech.android.task101.ui.dashboard.MyAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DashboardFragment extends Fragment {

    RecyclerView recyclerView;
int images[]={R.drawable.image1,R.drawable.image1,R.drawable.image1,R.drawable.image1,R.drawable.image1,R.drawable.image1,R.drawable.image1,R.drawable.image1};
 List<Object> viewItems = new ArrayList<>();
    List<Object> str = new ArrayList<>();
    String json ;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


            View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
            recyclerView = root.findViewById(R.id.recyclerView);
ApiManager apiManager=new ApiManager();
        JSONObject obj = null;
        json= apiManager.getSessions();

        try {


            obj = new JSONObject(json);

            JSONObject data=obj.getJSONObject("data");
            JSONArray array=data.getJSONArray("list");
            int length = array.length();
              for(int j=0; j<length; j++)
              {
                JSONObject json = array.getJSONObject(j);
              //  Log.d("TAG", "olala: "+json.getString("client_name").toString());
                String name=json.getString("client_name");
                String date=json.getString("session_place");
                String img=json.getString("client_pic");
                  Long start_time_ms=json.getLong("start_time_ms");
                  Long end_time_ms=json.getLong("end_time_ms");
                  long h=start_time_ms/ (1000*60*60) % 24;
                  long m =  start_time_ms/ (1000*60) % 60;
                  long eh=end_time_ms / (1000*60*60) % 24;
                  long em =end_time_ms / (1000*60) % 60;
          String start=   String.format("%02d:%02d",h,m);
                  String end=   String.format("%02d:%02d",eh,em);
                Users users = new Users(name, date,img,start,end);
                viewItems.add(users);



            }




        } catch (JSONException e) {
            e.printStackTrace();

        }

        MyAdapter myAdapter =new MyAdapter(getContext(),viewItems);
      recyclerView.setAdapter(myAdapter);




        return root;
    }

}