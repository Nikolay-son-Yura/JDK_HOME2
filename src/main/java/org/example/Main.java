package org.example;

import org.example.lesson3.Calculator;
import org.example.lesson3.CompareArrays;
import org.example.lesson3.Pair;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(10000000, 2));
        System.out.println(Calculator.divide(-10000000.01f, -3));
        System.out.println(Calculator.multiply(10000000, 2));
        System.out.println(Calculator.subtract(10000000, 2));
        System.out.println("-----------");
        Integer[] arr1 ={1,2,3,4,5};
        Integer[] arr2 ={1,2,3,4,5};
        Float[] flArr1={1.3f,1.2f,1.1f,1f};
        Float[] flArr2={1.3f,1.2f,1.1f};
        String[] strArr1={"a","c","b"};
        String[] strArr2={"a","b","c"};
        System.out.println( CompareArrays.compareArrays(arr1,arr2));
        System.out.println(CompareArrays.compareArrays(flArr1,flArr2));
        System.out.println(CompareArrays.compareArrays(strArr1,strArr2));
        System.out.println("-----------");
        Pair<String,Integer> pair1 = new Pair<>("a",1);
        Pair<Double,Character> pair2=new Pair<>(1.1,'A');
        System.out.println(pair2);
        System.out.println(pair1.getFirst());
        System.out.println(pair2.getSecond());

    }
}