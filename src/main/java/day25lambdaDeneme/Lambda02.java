package day25lambdaDeneme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");


        printElementsExceptStartsWithE(myList);
        System.out.println();


        printDistinctElementsLengthLessThanFive(myList);
        System.out.println();

        List<String> newList =getElementLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);


        printElementsLengthLessThanFiveUniqueLowerCase(myList);
        System.out.println();


        printElementsUniqueToUpperCaseSorted(myList);
        System.out.println();


        printElementsUniqueToUpperCaseSorted88(myList);
        System.out.println();



    }
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElementsExceptStartsWithE(List<String>myList){

        myList.stream().filter(t-> !t.startsWith("E")).forEach(t-> System.out.print(t+ " "));


    }



    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.

    public static void printDistinctElementsLengthLessThanFive(List<String>myList){

        myList.stream().filter(t-> t.length()<5).distinct().forEach(t-> System.out.print(t+" "));

    }

    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk
    // harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String>myList){
        return myList.
                stream().
                filter(t-> t.length()>5).
                map(t-> t.toUpperCase()).
                collect(Collectors.toList());

    }


    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.


    public static void printElementsLengthLessThanFiveUniqueLowerCase(List<String> myList){

        myList.stream().filter(t-> t.length()<5).distinct().map(t-> t.toLowerCase()).sorted().forEach(t-> System.out.print(t+" "));


    }



    public static void printElementsUniqueToUpperCaseSorted(List<String> myList){

        myList.stream().distinct().map(t-> t.toUpperCase()).sorted().forEach(t-> System.out.print(t+" "));
    }


    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge
    // siralayarak console'a yazdiran method'u olusturunuz.


    public static void printElementsUniqueToUpperCaseSorted88(List<String> myList){

        myList.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).// Uzunlukları karşılaştırark yazdırdık Comparator.reverseOrder küçükten büyüğe
                forEach(t-> System.out.print(t+" "));



    }







}
