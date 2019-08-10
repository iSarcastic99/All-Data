package com.example.search1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SearchView mySearchView;
    ListView myList;

    ArrayList<String> arrlist;
    ArrayAdapter<String> arradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySearchView = (SearchView)findViewById(R.id.searchView);
        myList = (ListView)findViewById(R.id.myList);
        arrlist = new ArrayList<String>();

        arrlist.add("January");
        arrlist.add("Febuary");
        arrlist.add("March");
        arrlist.add("April");
        arrlist.add("May");
        arrlist.add("June");
        arrlist.add("July");
        arrlist.add("August");
        arrlist.add("September");
        arrlist.add("October");
        arrlist.add("November");
        arrlist.add("December");

        arradapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrlist);
        myList.setAdapter(arradapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arradapter.getFilter().filter(newText);
                return false;
            }
        });


    }
}
