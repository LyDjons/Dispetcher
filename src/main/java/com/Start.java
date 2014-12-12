package com;



import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by LyDjons on 08.12.2014.
 */
public class Start {
    public static void main(String []args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Бункера   Шибиринівка");
        arrayList.add("Бункера   Шибиринівка");
        arrayList.add("Комбайни  Шибиринівка");
        arrayList.add("Бункера   Халявин, Шибиринівка");
        arrayList.add("Бункера   Халявин, Шибиринівка");
        arrayList.add("Комбайни  Шибиринівка");
        arrayList.add("Комбайни  Халявин, Шибиринівка");
        arrayList.add("Комбайни  Халявин, Шибиринівка");
        arrayList.add("Комбайни  Халявин, Шибиринівка");
        arrayList.add("Комбайни  Шибиринівка");
        for(int i = 0;i<arrayList.size();i++){

            arrayList.set(i,arrayList.get(i)+" ");
        }

        Collections.sort(arrayList,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1.substring(o1.indexOf(" "),o1.length());
                String s2 = o2.substring(o1.indexOf(" "),o2.length());

                return s2.toString().compareTo(s1.toString());

            }
        });

        for(String s : arrayList){
            System.out.println(s);


        }
    }
}
