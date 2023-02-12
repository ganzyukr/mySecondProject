package hw3;

public class Month {
    public static void main(String[] args) {

        int f;
        int year;
        int month;
        int days;

        year = 2023;
        month = 2;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2: // месяц февраль
                f = 0;

                // вложенный оператор if
                if (year % 400 == 0) f = 1;
                else if (year % 100 == 0) f = 0;
                else if (year % 4 == 0) f = 1;

                // вложенный оператор switch
                switch (f) {
                    case 0:
                        days = 28;
                        break;
                    default:
                        days = 29;
                }
                break;
            default:
                days = 31;
        }
        System.out.println("Кількість днів поточного місяця = " + days);

    }
}


// Другий варіант вирішення без switch:
//        Calendar cal = Calendar.getInstance();
//        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//        System.out.println();
//        System.out.println("Кількість днів поточного місяця : " + days);
//        System.out.println();

