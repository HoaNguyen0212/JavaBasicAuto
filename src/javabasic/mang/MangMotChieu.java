package javabasic.mang;

public class MangMotChieu {
    public static void main(String[] args) {
        //Khai báo màng luu gia tri so nguyen
        int songuyen[] = new int[10];

        //Gan gia tri cho mảng
        songuyen[0] = 5; //gan gia tri 5 vao vi tri thu nhat (mang bat dau tu 0)
        songuyen[1] = 7;
        songuyen[5] = 10;

        //Gan gia tri thong qua for

        for (int i = 0; i < songuyen.length; i++) {
            songuyen[i] = i*2;
        }

        System.out.println(songuyen[1]);//lay ra gia tri tai vi tri cu the

        //Truy xuat gia tri trong mảng
        for (int i = 0; i < 10; i++) {
            System.out.println("Phan tu thu " + i + " cua mảng là: " + songuyen[i]);
        }

        for (int i = 0; i < songuyen.length; i++) {
            System.out.println("Phan tu thu " + i + " cua mảng là: " + songuyen[i]);
        }

        for (int i : songuyen) {
            System.out.println(i);
        }
    }

}
