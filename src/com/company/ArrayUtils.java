package com.company;

import java.util.ArrayList;

public class ArrayUtils {
    public static <E> ArrayList<E> listMerge(ArrayList<E> list1, ArrayList<E> list2) {
        ArrayList<E> finalList = new ArrayList<>();
        finalList.addAll(list1);
        finalList.addAll(list2);
        return finalList;
    }
}
