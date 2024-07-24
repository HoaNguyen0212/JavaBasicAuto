package javabasic.learn_collection;

import java.util.ArrayList;

public class VidDuArrayList {
    public static void main(String[] args) {

        //Khai báo ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>();

        //Thêm phần tử vào ArrayList
        arrayList1.add("Selenium");
        arrayList1.add("Playwright");
        arrayList1.add("Cypress");
        arrayList1.add("Selenium");
        arrayList1.add("Selenium");
        arrayList1.add("Selenium");
        arrayList1.add("Selenium");

        arrayList1.add(1, "Katalon");
        arrayList1.add(3, "AkaAT Studio");

        //Duyệt phần tử trong arraylist
        //Dùng for cơ bản
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        //Dùng for cải tiến
        for (String i : arrayList1) {
            System.out.println(i);
        }

        //Khai báo ArrayList thứ 2
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Java");
        arrayList2.add("Python");

        //add All ArrayList2 to ArrayList1
        arrayList1.addAll(arrayList2);

        System.out.println("ArrayList1 sau khi add all ArrayList2: ");
        for (String i : arrayList1) {
            System.out.println(i);
        }

        //Remove 1 phần tử trong ArrayList
        arrayList1.remove("Selenium");
        arrayList1.remove(2);


        System.out.println("ArrayList1 sau khi xóa: ");
        for (String i : arrayList1) {
            System.out.println(i);
        }
        //remove có điều kiện
        int size = arrayList1.size();
        System.out.println(size);
        for (int i = size - 1; i >= 0; i--) {
            if (arrayList1.get(i).equals("Selenium")) {
                arrayList1.remove(i);

                System.out.println("vòng for của i đến: " + i);
                System.out.println("Mảng còn:" + arrayList1);
                System.out.println("Độ dài mảng còn lại: " + arrayList1.size());
            }
        }
        System.out.println("ArrayList sau khi xóa: ");
        for (String i : arrayList1) {
            System.out.println(i);
        }


        //Tìm kiếm giá trị phần tử
        arrayList1.contains("Java");//Trả ra true nếu tìm thấy
        System.out.println(arrayList1.contains("Katalon"));
    }
}
