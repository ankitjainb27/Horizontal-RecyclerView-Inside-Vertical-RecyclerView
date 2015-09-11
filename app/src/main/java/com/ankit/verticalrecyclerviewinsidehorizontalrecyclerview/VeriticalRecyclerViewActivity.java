package com.ankit.verticalrecyclerviewinsidehorizontalrecyclerview;

import android.app.Activity;
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
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm1 = new LinearLayoutManager(this);
        llm1.setOrientation(LinearLayoutManager.HORIZONTAL);
        initializeAdapter(llm1);
    }


    private void initializeAdapter(LinearLayoutManager llm1) {
        VertRVAdapter adapter = new VertRVAdapter(llm1);
        rv.setAdapter(adapter);
    }
}