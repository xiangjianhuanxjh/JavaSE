import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChk {
    public static boolean isEmpty(String s){
        if(s==null||"".equals(s)){return true;}
        return false;
    }
    public static boolean isWholeNumber(String s){
        if(isEmpty(s)){return false;}
        boolean result;
        Pattern pattern = Pattern.compile("[+-]?[0-9]+?");
        Matcher matcher = pattern.matcher(s);
        result = matcher.matches();
        return result;
    }
    public static boolean isPhoneNumber(String s){
        boolean result;
        Pattern pattern = Pattern.compile("^1[0-9]{10}$");
        Matcher matcher = pattern.matcher(s);
        result = matcher.matches();
        return result;
    }
    public static boolean isEmail(String s){
        boolean result;
        Pattern pattern = Pattern.compile("^\\w{3,}@(\\w+)\\.([a-z]{2,})(\\.[a-z]{2,})?$");
        Matcher matcher = pattern.matcher(s);
        result = matcher.matches();
        return result;
    }
    public static boolean isPostalCode(String s){
        boolean result;
        Pattern pattern = Pattern.compile("^\\d{6}$");
        Matcher matcher = pattern.matcher(s);
        result = matcher.matches();
        return result;
    }
    public static boolean isID(String s){
        boolean result;
        Pattern pattern = Pattern.compile("^\\d{17}(x|[0-9])$");
        Matcher matcher = pattern.matcher(s);
        result = matcher.matches();
        return result;
    }
}
