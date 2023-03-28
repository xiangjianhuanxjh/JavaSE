
public class Main {
    public static void main(String[] args){

        String[] WholeNumber = {"1","-1","0","1.1"};
        for (String s : WholeNumber) {
            System.out.println(s + ":" + RegexChk.isWholeNumber(s));
        }
        String[] PhoneNumber = {"18817326775","01234567890","123"};
        for (String s : PhoneNumber) {
            System.out.println(s + ":" + RegexChk.isPhoneNumber(s));
        }
        String[] Email = {"1903371036@qq.com","@163.com","123","190@qq.com.cn"};
        for (String s : Email) {
            System.out.println(s + ":" + RegexChk.isEmail(s));
        }
        String[] PostalCode = {"332200","002233","12345"};
        for (String s : PostalCode) {
            System.out.println(s + ":" + RegexChk.isPostalCode(s));
        }
        String[] ID = {"360481200111075610","36048120011107561x","123"};
        for (String s : ID) {
            System.out.println(s + ":" + RegexChk.isID(s));
        }
    }
}