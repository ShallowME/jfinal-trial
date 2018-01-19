package test_jfinal;

import com.jfinal.config.*;
import test_jfinal.TrialController;

/**
 * Created by shallow on 2017/10/31.
 */
public class TrialConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello",TrialController.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
