package com.ankit.verticalrecyclerviewinsidehorizontalrecyclerview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ankitjain on 11/09/15.
 */
public class VeriticalRecyclerViewActivity extends Activity {


    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recyclerview_activity);
        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        initializeAdapter(this);
    }


    private void initializeAdapter(Context context) {
        VertRVAdapter adapter = new VertRVAdapter(context);
        rv.setAdapter(adapter);
    }
}
