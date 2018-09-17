package com.example.kksip.hellosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class HelloSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_sample);

        //表示ボタンであるButtonオブジェクトを取得
        Button btClick = findViewById(R.id.btClick);
        //リスナクラスのインスタンス
        HelloLisner helloLisner = new HelloLisner();
        //表示ボタンのリスナ設定
        btClick.setOnClickListener(helloLisner);


        //クリアボタンであるButtonオブジェクトを取得
        Button btClear = findViewById(R.id.btClear);
        //クリアボタンにリスナ設定
        btClear.setOnClickListener(helloLisner);
    }

    /**
     * ボタンをクリックしたときのイベントリスナ
     */
    private class HelloLisner implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            //名前入力欄からEdit Textオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            //メッセージを表示するText Viewオブジェクトを取得
            TextView output = findViewById(R.id.tvOutput);


            //タップされた画面部品のidのR値を取得
            int id = view.getId();
            //idのR値に応じて処理を分岐
            switch (id){
                //表示ボタンの場合
                case R.id.btClick:
                    //入力された文字列を取得
                    String inputStr = input.getText().toString();
                    //メッセージ表示
                    output.setText(inputStr+"さん、こんにちは");
                    break;

                case R.id.btClear:
                    //名前入力欄を空に設定
                    input.setText("");
                    //メッセージ表示欄を空文字に設定
                    output.setText("");

                    Calendar now = new Calendar() {
                    }

            }


        }
    }
}
