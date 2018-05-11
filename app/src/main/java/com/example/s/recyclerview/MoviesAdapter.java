package com.example.s.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    public List<Movie> movieList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View thisItemsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new MyViewHolder(thisItemsView);

    }

    public MoviesAdapter(List<Movie> movieList) {
        this.movieList = movieList;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.tv1.setText(movie.getTitle());
        holder.tv2.setText(movie.getGenre());
        holder.tv3.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tv1;
        public TextView tv2;
        public TextView tv3;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv1 = (TextView) itemView.findViewById(R.id.tv_mName);
            tv2 = (TextView) itemView.findViewById(R.id.mGenre);
            tv3 = (TextView) itemView.findViewById(R.id.mYear);
        }
    }
}
