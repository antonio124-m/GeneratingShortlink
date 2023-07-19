package com.antonio.shortlink.UrlLogic;

import com.google.common.hash.Hashing;
import org.apache.commons.validator.routines.UrlValidator;

import java.nio.charset.Charset;
import java.util.HashMap;

public class GenerateShortlink {

    public static String getShortlink( String url){

        String shortlink = Hashing.murmur3_32_fixed().hashString(url, Charset.defaultCharset()).toString();



        return shortlink;
    }

    public  static boolean IsUrlValid(String url){

        boolean results = UrlValidator.getInstance().isValid(url);
        return results;
    }



}
