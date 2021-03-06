package com.mightted.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 晓深 on 2017/3/7.
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
