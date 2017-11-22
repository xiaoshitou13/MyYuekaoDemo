package byc.by.com.myyuekaodemo.model;

import byc.by.com.myyuekaodemo.bean.Mydatas;
import byc.by.com.myyuekaodemo.utils.IApiservice;
import byc.by.com.myyuekaodemo.utils.LoggingInterceptor;
import byc.by.com.myyuekaodemo.view.Iviews;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 白玉春 on 2017/11/22.
 */

public class Mymodel implements Imodel{

    @Override
    public void Qing(final Iviews iviews) {
        OkHttpClient builder = new OkHttpClient.Builder().addInterceptor(new LoggingInterceptor()).build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://result.eolinker.com/").addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder).build();

        IApiservice iApiservice = retrofit.create(IApiservice.class);

        Observable<Mydatas> m = iApiservice.getDats();

        m.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Mydatas>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Mydatas mydatas) {
                        iviews.Success(mydatas);
                    }
                });
    }
}
