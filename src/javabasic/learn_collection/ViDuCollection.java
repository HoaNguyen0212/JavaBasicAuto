package javabasic.learn_collection;

import java.util.*;

public class ViDuCollection {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(); //ArrayList lưu theo thứ tự
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.println("\t" + arrayList);

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.println("\t" + linkedList);

        Set<Integer> integerSet = new HashSet<>(); //HashSet thì nó lưu không theo thứ tự
        integerSet.add(12);
        integerSet.add(5);
        integerSet.add(30);
        integerSet.add(20);
//        integerSet.stream().sorted();
        System.out.println("Các giá trị trong HashSet: " + integerSet);

        Set<Integer> integerTreeSet = new TreeSet<>();//TreeSet thì nó sắp xếp theo thứ tự
        integerTreeSet.add(12);
        integerTreeSet.add(5);
        integerTreeSet.add(30);
        integerTreeSet.add(20);
        System.out.println("Các giá trị trong TreeSet: " + integerTreeSet);


        Map<String, String> stringMap = new HashMap<>(); //HashMap thì nó không theo thứ tự
        stringMap.put("project", "Bank");
        stringMap.put("company","Viettel");

        System.out.println(stringMap);
        System.out.println(stringMap.get("company"));
    }
}
