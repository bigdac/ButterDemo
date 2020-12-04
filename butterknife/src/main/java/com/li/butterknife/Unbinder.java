package com.li.butterknife;

import androidx.annotation.UiThread;

/**
 * @author li
 * 版本：1.0
 * 创建日期：2020-07-27 11
 * 描述：
 */
public interface Unbinder {
    @UiThread
    void unbind();

    Unbinder EMPTY = new Unbinder() {
        @Override
        public void unbind() {

        }
    };
}
