package com.company;

import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try{
            URL url=new URL("http://www.google.com");
            HttpURLConnection con=(HttpURLConnection)url.openConnection();
            for(int i=1;i<=8;i++){
                System.out.println(con.getHeaderFieldKey(i)+" = "+con.getHeaderField(i));
            }
            con.disconnect();
        }catch(Exception e){System.out.println(e);}
    }
}
