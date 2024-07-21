package javabasic.bien;

public class BienCucBo {
    public void sayHello() {
        int n = 10;     //Đây là biến cục bộ (local)
        System.out.println("Giá trị của n là: " + n);
    }

    public static void main(String[] args) {

        String name = "Hoa";    //Biến cục bộ

        BienCucBo bienLocal = new BienCucBo();
        bienLocal.sayHello();
    }
}
