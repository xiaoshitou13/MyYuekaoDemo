package byc.by.com.myyuekaodemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import byc.by.com.myyuekaodemo.bean.Mydatas;
import byc.by.com.myyuekaodemo.duoxian.DownloadUtil;
import byc.by.com.myyuekaodemo.presenter.Mypresenter;
import byc.by.com.myyuekaodemo.view.Iviews;

public class MainActivity extends AppCompatActivity implements Iviews{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Initeview();
    }

    private void Initeview() {


        Mypresenter mypresenter= new Mypresenter(this,this);
        mypresenter.Fnagfa();

    }

    @Override
    public void Success(Mydatas m) {
        //String urlString = "http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4";


    }
}
