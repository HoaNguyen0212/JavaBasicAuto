package javabasic.phuongthuc;

public class Company {

    public static String COMPANY_NAME = "VConnex";
    public static String ADDRESS = "Hà Nội";
    public static String PHONE = "0826763234";
    public static String EMAIL = "Hoanguyen02122002@gmail.com";

    public static void getInfoCompany() {
        System.out.println("Company Name: " + COMPANY_NAME);
        System.out.println("Address: " + ADDRESS);
        System.out.println("Phone: " + PHONE);
        System.out.println("Email: " + EMAIL);
    }

    public static String getCompanyName() {
        return COMPANY_NAME;
    }

    public static String getEmail() {
        return EMAIL;
    }
}
