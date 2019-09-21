package com.ys.account.utils;

import java.util.Random;

/**
 * @author 汤先生
 */
public class Code {
    public static int getCode (){
        Random ne=new Random();
        int x = ne.nextInt(8999+1)+1000;
        return  x ;
    }

}

