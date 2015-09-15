package com.ankit.verticalrecyclerviewinsidehorizontalrecyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankitjain on 11/09/15.
 */
public class VertRVAdapter extends RecyclerView.Adapter<VertRVAdapter.HoriRecyclerViewHolder> {
    Context context;
    DisplayMetrics metrics;

    public static class HoriRecyclerViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;


        HoriRecyclerViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.hori_rv1);
        }


    }

    VertRVAdapter(Context context, DisplayMetrics metrics) {
        this.context = context;
        this.metrics = metrics;


    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public HoriRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hori, viewGroup, false);
        HoriRecyclerViewHolder pvh = new HoriRecyclerViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(HoriRecyclerViewHolder horiRecyclerViewHolder, int i) {
        List<Person> persons;
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.emma));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.lavery));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.lillie));
        HoriRVAdapter adapter = new HoriRVAdapter(persons);
        LinearLayoutManager llm1 = new LinearLayoutManager(context);
        llm1.setOrientation(LinearLayoutManager.HORIZONTAL);

        horiRecyclerViewHolder.recyclerView.setLayoutManager(llm1);
        horiRecyclerViewHolder.recyclerView.setLayoutParams(new RecyclerView.LayoutParams(metrics.widthPixels, 300));
        horiRecyclerViewHolder.recyclerView.setAdapter(adapter);

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
