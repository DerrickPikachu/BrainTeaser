package com.example.brainteaser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] question = {"為甚麼門永遠關不上?", "甚麼東西沒人愛吃?", "甚麼瓜不能吃?",
                        "什麼布切不斷?", "甚麼鼠最愛乾淨?", "偷甚麼不犯法?",
                        "廁所要放什麼花?"};
    String[] answer = {"球門", "虧", "傻瓜", "瀑布", "環保署", "偷笑", "五月花"};
    ArrayAdapter<String> questionAdapter;
    ListView questionList;
//    Toast hint;
    Snackbar hint;

    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, question);

        questionList = findViewById(R.id.questionList);
        questionList.setOnItemClickListener(this);
        questionList.setAdapter(questionAdapter);

        hint = Snackbar.make(findViewById(R.id.root),"", Snackbar.LENGTH_SHORT);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        hint.setText("答案:" + answer[i]);
//        if (i % 2 == 1) {
//            hint.setDuration(Snackbar.LENGTH_LONG);
//        }
//        else {
//            hint.setDuration(Toast.LENGTH_SHORT);
//        }
        hint.show();
    }
}
