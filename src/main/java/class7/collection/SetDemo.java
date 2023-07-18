package class7.collection;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
       HashSet<Integer> number = new HashSet<>();
       number.add(10);
        number.add(20);
        number.add(30);
        number.add(30);

        System.out.println(number);

        //using for each loop

        for (Integer i :number){
            System.out.println(i);
        }

        //add
        number.add(40);
        System.out.println(number);

        //remove
        number.remove(40);
        System.out.println(number);
        //size
        System.out.println("Size is : "+number.size());

        HashSet<String> name = new HashSet<>();
        name.add("Shakib");
        name.add("Tamim");
        System.out.println("Name is : "+name);

        HashSet<String> name1 = new HashSet<>();
        name1.addAll(name);
        name1.add("Rahim");
        System.out.println("Name is : "+name1);

    }
}
