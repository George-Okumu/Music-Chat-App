package com.moringa.musicchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {
    private ListView listView;

    private String[] messages = new String[] {"At vero eos et accusamus et iusto odio dignissimos ducimus","Et harum quidem rerum facilis est et expedita distinctio.",
    "On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms","The wise man therefore always holds in these matters to this principle of selection:",
    "But I must explain to you how all this mistaken idea of denouncing pleasure "," (The Extremes of Good and Evil) by Cicero, written in"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        this.listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item, messages);
        listView.setAdapter(adapter);
    }

}