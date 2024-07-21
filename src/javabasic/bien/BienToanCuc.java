package javabasic.bien;

public class BienToanCuc {

    //Biến toàn cục
    String name = "Hoa";
    int age = 22;
    String address = "Thanh Hóa";

    public void getInfo1() {

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Quê quán: " + address);
    }

    public void getInfo2() {

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Quê quán: " + address);
    }

    public static void main(String[] args) {
        BienToanCuc bienToanCuc = new BienToanCuc();
        System.out.println("Tên: " + bienToanCuc.name);
        System.out.println("Tuổi: " + bienToanCuc.age);
        System.out.println("Quê quán: " + bienToanCuc.address);

    }

}
