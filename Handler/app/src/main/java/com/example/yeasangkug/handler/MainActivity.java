package com.example.yeasangkug.handler;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);
        btn = (Button)findViewById(R.id.btn);

    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.btn :
                Thread th = new Thread(new Runnable(){
                    int i = 0 ;
                    @Override
                    public void run() {
                        while(20 > i)
                        {
                            try {
                                Thread.sleep(1000);
                                Message msg = new Message();
                                msg.what = 1;
                                msg.arg1 = i;
                                handler.sendMessage(msg);
                                System.out.println("Handler Call");

                                i++;

                            }catch (Exception e){e.printStackTrace();}

                        }
                    }
                } );

                th.start();
            break;
        }
    }


    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            switch(msg.what)
            {
                case 1 :
                    int i = msg.arg1;
                    tv.setText(""+i);
                    System.out.println("Handler Message Recive");
                break;
            }
        }
    };
}
