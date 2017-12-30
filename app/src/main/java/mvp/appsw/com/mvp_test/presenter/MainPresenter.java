package mvp.appsw.com.mvp_test.presenter;

import android.content.Context;
import android.graphics.Color;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mvp.appsw.com.mvp_test.contract.BaseContract;
import mvp.appsw.com.mvp_test.network.api.HelloCall;
import mvp.appsw.com.mvp_test.network.client.ServiceGenerator;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by xhendor on 12/27/17.
 */

public class MainPresenter  implements BaseContract.Presenter{

    private final Context context;

    public MainPresenter(Context context){

        this.context=context;
    }



    @Override
    public Context getAppContext() {
        return context;
    }

    @Override
    public String llamarCadena() {


       HelloCall helloCall = ServiceGenerator.createService(HelloCall.class);


        rx.Observable<String> call4 = helloCall.helloCall();
        call4.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Subscriber<String>() {

            @Override
            public void onCompleted() {



            }

            @Override
            public void onError(Throwable e) {

                e.printStackTrace();
            }

            @Override
            public void onNext(String resp) {

            }
        });




        return null;
    }
}
