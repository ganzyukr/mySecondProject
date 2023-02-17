package hw7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegEex {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        phones.add("+380671493325");
        phones.add("380671493325");
        phones.add("+380631493325");
        phones.add("+380961111111");
        phones.add("+389611111111");
        phones.add("+38067149");
        phones.add("+11111111dd1");
        phones.add("+830671493325");
        phones.add("+83_067_149_33_25");

        String regex = "^((\\+?380)(\\d{9}))$";

        Pattern pattern = Pattern.compile(regex);

        for (String phone : phones) {
            Matcher matcher = pattern.matcher(phone);
            System.out.println("Phone number '" + phone + "' is :  " + matcher.matches());
        }
    }
}
