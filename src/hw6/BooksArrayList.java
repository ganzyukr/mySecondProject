package hw6;

import java.util.*;
import java.util.stream.Collectors;

class BooksArrayList {

    private String bookName;
    private String bookNum;


    public BooksArrayList(String bookName, String bookNum) {
        this.bookName = bookName;
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return bookName + '=' + bookNum;
    }

    public String getBookNum() {
        return bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public static void main(String[] args) {                     // програма для перетворення Array на Map

        List<BooksArrayList> books = new ArrayList<>();          // вхідний список об'єктів `BooksArrayList`

        books.add(new BooksArrayList("1 ", " Їжа для мозку"));
        books.add(new BooksArrayList("2 ", " Володар мух"));
        books.add(new BooksArrayList("3 ", " Ребекка"));
        books.add(new BooksArrayList("4 ", " Ім’я рози"));
        books.add(new BooksArrayList("5 ", " Прислуга"));

        // створюємо пари ключ-значення (два способи) з полів `bookNum` та `bookName` класу `BooksArrayList`
                      // Перший спосіб:
//        Map<String, String> map = new HashMap<>();
//        for (BooksArrayList ob : books) {
//            map.put(ob.getBookName(), ob.getBookNum());
//        }
                      // Другий спосіб:
        Map<String, String> map = books.stream()
                .collect(Collectors.toMap(BooksArrayList::getBookName, BooksArrayList::getBookNum));

        System.out.println("List : " + books);
        System.out.println("Map  : " + map);
    }
}
