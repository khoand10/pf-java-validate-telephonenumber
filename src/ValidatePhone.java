import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    static boolean validateAccount(String string) {
        Pattern p = Pattern.compile("^[(][0-9]{2}[)]-[(]0[0-9]{9,10}[)]$");
        Matcher m = p.matcher(string);
        return m.matches();
    }

    public static void main(String[] args) {
        String[] accounts = {"(84)-(01663822376)", "(84)-(61663822376)","(84)(01663822376)"};
        for (String account : accounts) {
            System.out.println(account + ": " + validateAccount(account));
        }
    }
}
