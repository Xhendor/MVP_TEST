package mvp.appsw.com.mvp_test.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import mvp.appsw.com.mvp_test.R;
import mvp.appsw.com.mvp_test.contract.BaseContract;

public class MainActivity extends AppCompatActivity implements BaseContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showDialog(String titulo, String mensaje) {

    }

    @Override
    public void showToast(String mensaje) {


    }

    @Override
    public Context getAppContext() {
        return this.getApplicationContext();
    }
}
