package mvp.appsw.com.mvp_test.contract;

import android.content.Context;

/**
 * Created by xhendor on 12/27/17.
 */

public class BaseContract {


    public interface View {

        void showLoading();

        void hideLoading();

        void showDialog(String titulo, String mensaje);

        void showToast(String mensaje);

        Context getAppContext();

    }

    public interface Presenter{

        Context getAppContext();

        String llamarCadena();

    }
}
