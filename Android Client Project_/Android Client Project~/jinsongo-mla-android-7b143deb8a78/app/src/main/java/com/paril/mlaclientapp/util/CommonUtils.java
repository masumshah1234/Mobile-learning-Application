package com.paril.mlaclientapp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by paril on 02-Oct-17.
 */

public class CommonUtils {
    //public static String MlaBaseURL = "http://ec2-34-213-163-143.us-west-2.compute.amazonaws.com/MlaWebApi/";
    //public static String MlaBaseURL = "http://ec2-54-153-70-101.us-west-1.compute.amazonaws.com/MlaWebApi/";
    public static String MlaBaseURL = "http://ec2-54-193-53-48.us-west-1.compute.amazonaws.com/MlaWebApi/";

    public static String EXTRA_USER_ADMIN_DATA="extra_user_admin_data";

    public static String EXTRA_IS_TO_ADD="extra_is_to_add";

    public static String EXTRA_EDIT_MODE="extra_edit_mode";

    public static boolean checkInternetConnection(Context context){
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        return isConnected;
    }

    public static boolean isValidMobile(String phone) {
//        String phoneRegexStr = "\\d{3}-\\d{3}-\\d{4}";
//        Pattern pattern = Pattern.compile(phoneRegexStr);
        return phone.length()==10;
    }

    public static boolean isValidMail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}


