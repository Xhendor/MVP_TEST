package mvp.appsw.com.mvp_test.network.api;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by xhendor on 12/27/17.
 */

public interface HelloCall {

    @POST("hello")
    Observable<String> helloCall();

    @GET("hello2")
    Observable<String> helloCallGet();
}
