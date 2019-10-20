package com.liuchuanzheng.base_lib;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 所有的常量类。这里每个常量不用大写表示，因为个人不喜欢，看大写字母一眼看不明白
 */
public class Constant {


    /**
     * Tag
     */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Tag {


        /**
         * 打印log的tag
         */
        String tag = "组件化demo";
    }

}
