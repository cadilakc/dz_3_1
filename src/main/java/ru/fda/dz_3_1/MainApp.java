package ru.fda.dz_3_1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Object[] arr = new Object[]{1, 2, 3, 4, 5};
        Object[] arr1 = new Object[]{"A", "B", "C", "D", "E"};
        replace(arr, 2, 3);
        replace(arr1, 4, 1);
        arrList(arr);


    }

    public static <E> ArrayList<E> arrList(E[] arr) {
        return (arr != null) ? new ArrayList<>(Arrays.asList(arr)) : null;
    }

    public static void replace(Object[] arr, int x, int y) {
        Object replace = arr[x];
        arr[x] = arr[y];
        arr[y] = replace;
    }
}
