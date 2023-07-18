package class7.collection;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println("Size is : "+number.size());
//        System.out.println("ArrayList Contains : "+number);
        for (Integer i : number) {
            System.out.println(i);

        }

        //update
        number.add(2,50);
        System.out.println(number);

        //remove

        number.remove(3);
        System.out.println(number);

        //size
        System.out.println(number.size());
        System.out.println("");

        ArrayList<String> name = new ArrayList<>();
        name.add("Rahim");
        name.add("Karim");
        name.add("Jamal");
        name.add("Kamal");



        for (String str:name){

            System.out.println(str);
        }

        ArrayList<String> country = new ArrayList<>();
        country.add("Bangladesh");
        country.addAll(name);
        System.out.println(country);

        System.out.println(country.size());


    }
}
