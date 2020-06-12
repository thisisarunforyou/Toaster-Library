package com.sap.i006590.toasterlibrary;

public class ToasterMessage {

    public static void s(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
