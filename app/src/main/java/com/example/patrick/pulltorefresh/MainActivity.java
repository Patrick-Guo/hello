package com.example.patrick.pulltorefresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listView;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAdapter = new MyAdapter(this, getData());

        listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(this);
    }

    private List<String> getData(){
        List<String> data = new ArrayList<String>();
        data.add("abc");
        data.add("eee");
        data.add("ddd");
        return data;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, myAdapter.getItem(position)+"", Toast.LENGTH_SHORT).show();
    }
}
