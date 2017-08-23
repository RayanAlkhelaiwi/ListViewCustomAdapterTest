package me.rayanalkhelaiwi.listviewcustomadaptertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<FooBarList> fooBarLists = new ArrayList<>();
        fooBarLists.add(new FooBarList("foo one", "bar one", R.mipmap.ic_launcher));
        fooBarLists.add(new FooBarList("foo two", "bar two", R.mipmap.ic_launcher_round));
        fooBarLists.add(new FooBarList("foo three", "bar three", R.mipmap.ic_launcher_round));
        fooBarLists.add(new FooBarList("foo four", "bar four", R.mipmap.ic_launcher));

        FooBarAdapter fooBarAdapter = new FooBarAdapter(this, fooBarLists);
        ListView listView = (ListView) findViewById(R.id.list_main);
        listView.setAdapter(fooBarAdapter);

    }
}
