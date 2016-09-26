package qianfeng.flagapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FlagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);
    }

    public void btn(View view) {

    }


    public void flag(View view) {
        Intent intent = new Intent();
        // intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); // singleTop
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // singleTask
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // singleInstance: 单独的任务栈来存放Activity
        startActivity(intent);

    }
}
