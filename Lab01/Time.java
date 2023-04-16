import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        String month;
        int year;
        int day;
        Scanner keybroad = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = keybroad.nextInt();
        keybroad.nextLine();

        do {
            System.out.print("Enter the month: ");
            month = keybroad.nextLine();
            switch (month) {
                case "January":
                case "Jan":
                case "Jan.":
                case "1":
                case "March":
                case "Mar":
                case "Mar.":
                case "3":
                case "May":
                case "5":
                case "July":
                case "Jul":
                case "7":
                case "August":
                case "Aug":
                case "Aug.":
                case "8":
                case "Octobe":
                case "Oct":
                case "Oct.":
                case "10":
                case "December":
                case "Dec":
                case "Dec.":
                case "12":
                    day = 31;
                    break;
                case "June":
                case "Jun":
                case "6":
                case "April":
                case "Apr":
                case "Apr.":
                case "4":
                case "Septemper":
                case "Sep":
                case "Sept.":
                case "9":
                case "November":
                case "Nov":
                case "Nov.":
                case "11":
                    day = 30;
                    break;
                case "February":
                case "Feb":
                case "Feb.":
                case "2":
                    if (LeafYear(year)) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                    break;
                default:
                    day = 0;
                    System.out.println();
                    System.out.println("Enter again!");
            }
        } while (day == 0);
        System.out.println(year + " " + month + " has " + day + " days.");
    }

    static boolean LeafYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if ((year % 100 == 0) & (year % 400 != 0)) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
