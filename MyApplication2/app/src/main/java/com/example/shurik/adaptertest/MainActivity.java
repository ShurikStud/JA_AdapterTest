package com.example.shurik.adaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.shurik.adaptertest.adapter.MyAdapter;
import com.example.shurik.adaptertest.item.Car;
import com.example.shurik.adaptertest.item.Sotrudnik;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Sotrudnik> listSotrudnik;
    private ListView    listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView    = (ListView) findViewById(R.id.activity_main_list_view);

        listView.setAdapter(new MyAdapter(this, ));

        fillData();
    }

    private void fillData(){
        listSotrudnik = new ArrayList<Sotrudnik>();

        int y;

        for (int i = 1; i++ < 20;){

            y = i + 54;
            listSotrudnik.add(i, new Sotrudnik(y, "name " + y, "1535445" + y, "m", new Car(1, "LADA")));

        }

    }
}
