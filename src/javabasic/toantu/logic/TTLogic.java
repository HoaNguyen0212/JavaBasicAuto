package javabasic.toantu.logic;

public class TTLogic {
    public static void main(String[] args) {


        String mess1 = "Login successful";
        String mess2 = "Login successfully";

        int number1 = 10;
        int number2 = 20;
        int number3 = 10;

        //Toán tử và &&
        /*
        - Toán tử và chỉ đúng khi tất cả điều kiện đều đúng. Ngược lại sẽ sai khi có 1 thằng sai
        - Dùng để kết hợp các điều kiện lại với nhau (Với điều kiện là khác nhau)
         */

        System.out.println((mess1 == mess2) && (number1 == number3));

        //Toán tử hoặc ||
        /*
        - Toán tử hoặc sẽ đúng khi chỉ cần 1 trong các điều kiện đúng. Ngược lại chỉ sai khi tất cả đều sai
        -  - Dùng để kết hợp các điều kiện lại với nhau (Trên cùng 1 loại điều kiện)
         */
        System.out.println((mess1 == mess2) || (number1 == number3));

        //Toán tử NOT !
        System.out.println(!((mess1 == mess2) && (number1 == number3)));

        //Toán tử gán
        int var = 20;
        int p, q, r, s;
        p = q = r = s = var; //gán giá trị đồng loạt (đều kiiện là tất cả biến phải cùng kiểu dữ liệu)

    }
}
