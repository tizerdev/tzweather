package com.tzweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 桃子 on 2018/2/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}