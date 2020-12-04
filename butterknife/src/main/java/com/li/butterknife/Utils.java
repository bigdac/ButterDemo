package com.li.butterknife;

import android.app.Activity;
import android.view.View;

/**
 * Created by hcDarren on 2017/9/9.
 */

public class Utils {
    public static <T extends View> T findViewById(Activity activity,int viewId){
        return (T) activity.findViewById(viewId);
    }
}
