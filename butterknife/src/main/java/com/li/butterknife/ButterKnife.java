package com.li.butterknife;

import android.app.Activity;

import java.lang.reflect.Constructor;

/**
 * @author li
 * 版本：1.0
 * 创建日期：2020-07-27 11
 * 描述：
 */
public class ButterKnife  {

    public final static Unbinder bind(Activity activity){
//        try {
//            Class<? extends Unbinder> bindClassName = (Class<? extends Unbinder>) Class.forName(activity.getClass().getName()+"_ViewBinding");
//            Constructor<? extends Unbinder> bindConstructor =  bindClassName.getDeclaredConstructor(activity.getClass());
//            Unbinder unbinder = bindConstructor.newInstance(activity);
//            return  unbinder;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return Unbinder.EMPTY;
        String viewBindingClassName = activity.getClass().getName() + "_ViewBinding";
        try {
            Class<? extends Unbinder> viewBindingClass = (Class<? extends Unbinder>) Class.forName(viewBindingClassName);
            Constructor<? extends Unbinder> viewBindingConstructor = viewBindingClass.getDeclaredConstructor(activity.getClass());
            Unbinder unbinder = viewBindingConstructor.newInstance(activity);
            return unbinder;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unbinder.EMPTY;
    }
}
