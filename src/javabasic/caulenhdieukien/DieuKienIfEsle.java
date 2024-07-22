package javabasic.caulenhdieukien;

public class DieuKienIfEsle {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;

        float average = 7.5F;

        String message = "Login successful";
        //hàm equals để so sánh bằng
        //Hàm contains so sánh chứa
        //hàm length lấy ra độ dài của chuỗi

        if ((number1 < number2) && message.equals("Login successful")) {
            System.out.println("Thỏa mãn điều kiện");
        } else {
            System.out.println("Không thỏa mãn điều kiện");
        }

        if (average >= 8) {
            System.out.println("Học sinh Giỏi");
        } else if (average < 8 && average >= 6.5) {
            System.out.println("Học sinh Khá");
        } else if (average >= 5 && average < 6.5) {
            System.out.println("Học sinh Trung Bình");
        } else {
            System.out.println("Học sinh Yếu");
        }
    }
}
