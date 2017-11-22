package byc.by.com.myyuekaodemo.utils;


import byc.by.com.myyuekaodemo.bean.Mydatas;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by 白玉春 on 2017/11/22.
 */

public interface IApiservice {

    @GET("iYXEPGn4e9c6dafce6e5cdd23287d2bb136ee7e9194d3e9?uri=vedio")
    Observable<Mydatas> getDats();
}
