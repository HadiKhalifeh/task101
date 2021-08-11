package com.agiliatech.android.task101.ui.dashboard;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agiliatech.android.task101.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String name[],date[];
    Context context;
    int images[];
List<Object> listRecyclerItem;
    private static final int TYPE = 1;


    public MyAdapter(Context ct, List<Object> listRecyclerItem){
   context=ct;
        this.listRecyclerItem = listRecyclerItem;



        }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int viewType = getItemViewType(position);

        switch (viewType) {
            case TYPE:
            default:

                MyViewHolder itemViewHolder = (MyViewHolder) holder;
                Users users = (Users) listRecyclerItem.get(position);

                itemViewHolder.name.setText(users.getName());
                itemViewHolder.date.setText("Start: ");
                itemViewHolder.date.append(users.getStart());
                itemViewHolder.date.append("\t End: ");
                itemViewHolder.date.append(users.getEnd());
                itemViewHolder.description.setText(users.getDescription());
                Log.d("TAG", "context: "+context);

                //  itemViewHolder.imageView.setImageBitmap(users.getImage());
              //  Picasso.with(context).load(listRecyclerItem.get(position)).getImage()).into(itemViewHolder.imageView);
                Picasso.get().load(users.getImage()).error(R.drawable.image1).into(itemViewHolder.imageView);
        }


    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView date;
        private TextView description;
        private ImageView imageView;


        public MyViewHolder (@NonNull View itemView){
            super(itemView);
            name=itemView.findViewById(R.id.data);
            date=itemView.findViewById(R.id.date);
            description=itemView.findViewById(R.id.description);
            imageView=itemView.findViewById(R.id.imageView);

        }
    }
}
