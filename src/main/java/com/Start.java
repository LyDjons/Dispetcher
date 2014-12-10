package com;



import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by LyDjons on 08.12.2014.
 */
public class Start {
    public static void main(String []args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for(int i = arrayList.size()-1; i >-1;i--){
            System.out.println(arrayList.get(i));

        }
    }
}
