public class PhoneMasker {
    static String maskPhoneNumber(String phone){
        if(phone.length()!=10) return "Invalid phone number";
        for(char c:phone.toCharArray()) if(!Character.isDigit(c)) return "Invalid phone number";
        return "XXXXXX-"+phone.substring(6);
    }
    public static void main(String[] args){
        System.out.println(maskPhoneNumber("9876543210"));
        System.out.println(maskPhoneNumber("98765"));
    }
}
