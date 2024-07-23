package javabasic.vonglapfor;

public class VongLapForCaiTien {
    public static void main(String[] args) {

        int arr[] = {12, 23, 44, 56, 78};   //Đây là mảng chứa nhiều giá trị cùng kieu du lieu

        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
