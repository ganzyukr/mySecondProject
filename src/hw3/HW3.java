package hw3;

public class HW3 {

    static String max(String par) {
        String[] words = par.split(" ");
        String resstring = "";
        for (String word : words) {
            if (word.length() > resstring.length())
                resstring = word;
        }
        return (resstring);
    }

    static public void main(String args[]) {
        String somestring = "seven seventy seventeen";
        String maxword = max(somestring);

        System.out.println("Саме найдовше слово серед трьох - " + maxword);
        System.out.println("Кількість символів слова - " + maxword.length());
    }

    // Другий варіант вирішення:
//    static ArrayList<String> longestWords(String[] dictionary) {
//        ArrayList<String> list = new ArrayList<String>();
//        int longest_length = 0;
//        for (String str : dictionary) {
//            int length = str.length();
//            if (length > longest_length) {
//                longest_length = length;
//                list.clear();
//            }
//            if (length == longest_length) {
//                list.add(str);
//            }
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//        //String [] dict = {"cat", "flag", "green", "country", "w3resource"};
//        String[] dict = {"seven", "seventy", "seventeen"};
//        System.out.println("Набор слів : " + Arrays.toString(dict));
//        System.out.println("Найдовше слово (слова) з вищезазначеного Набора слів: " + longestWords(dict));
//    }
}
