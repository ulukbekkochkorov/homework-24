package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
       for (Integer a : hashSet1)
            System.out.print(a + ", ");
        System.out.println();
       HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(0);
        hashSet2.add(1);
        hashSet2.add(2);
        for (Integer a : hashSet2)
            System.out.print(a + ", ");
        System.out.println();
        System.out.println(symmetricDifference(hashSet1,hashSet2));
        }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
       Set <Integer> result = new HashSet<>();
        for (Integer i : set2) {
        if (!set1.contains(i)) {
            result.add(i);}
        else {set1.remove(i);}

        }
        result.addAll(set1);
        return result;
    }

}
