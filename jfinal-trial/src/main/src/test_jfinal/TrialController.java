package test_jfinal;

import com.jfinal.core.Controller;

/**
 * Created by shallow on 2017/10/31.
 */
public class TrialController extends Controller {
    public void index(){
        renderText("Hello Maven Jfinal");
    }

    public int test(){return 1+1; }
}
