package byc.by.com.myyuekaodemo.presenter;

import android.content.Context;

import byc.by.com.myyuekaodemo.bean.Mydatas;
import byc.by.com.myyuekaodemo.model.Mymodel;
import byc.by.com.myyuekaodemo.view.Iviews;

/**
 * Created by 白玉春 on 2017/11/22.
 */

public class Mypresenter {

    Mymodel mymodel;
    Context context;
    Iviews iviews;

    public Mypresenter(Context context, Iviews iviews) {
        this.context = context;
        this.iviews = iviews;
        this.mymodel = new Mymodel();
    }

    public void  Fnagfa(){
        mymodel.Qing(new Iviews() {
            @Override
            public void Success(Mydatas m) {
                 iviews.Success(m);
            }
        });
    }
}
