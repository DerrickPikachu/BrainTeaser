package com.example.brainteaser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] question = {"為甚麼門永遠關不上?", "甚麼東西沒人愛吃?", "甚麼瓜不能吃?",
                        "什麼布切不斷?", "甚麼鼠最愛乾淨?", "偷甚麼不犯法?"};
    String[] answer = {"球門", "虧", "傻瓜", "瀑布", "環保署", "偷笑"};
    ArrayAdapter<String> questionAdapter;
    ListView questionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, question);

        questionList = findViewById(R.id.questionList);
        questionList.setOnItemClickListener(this);
        questionList.setAdapter(questionAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast hint = Toast.makeText(this, answer[i], Toast.LENGTH_SHORT);
        hint.show();
    }
}
