import java.util.Scanner;
public class DaysofMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputMonth = scanner.nextLine();
        int inputYear = scanner.nextInt();

        switch(inputMonth){
            case "March":
            case "Mar":
            case "Mar.":
            case "3":
            case "May":
            case "May.":
            case "5":
            case "July":
            case "Jul":
            case "7":
            case "August":
            case "Aug":
            case "Aug.":
            case "8":
            case "October":
            case "Oct":
            case "Oct.":
            case "10":
            case "December":
            case "Dec":
            case "Dec.":
            case "12":
            case "January":
            case "Jan":
            case "Jan.":
            case "1":
                System.out.println("31 ngay");
                break;
            
            case "February":
            case "Feb":
            case "Feb.":
            case "2":
                if (inputYear%4 == 0 && inputYear%100 != 0){
                    System.out.println("29 ngay");
                }
                else if (inputYear%400 == 0) {
                    System.out.println("29 ngay");
                }
                else {
                    System.out.println("28 ngay");
                }
                break;
            
            case "April":
            case "Apr":
            case "4":
            case "June":
            case "Jun":
            case "6":
            case "September":
            case "Sep":
            case "9":
            case "November":
            case "Nov":
            case "11":
            case "Apr.":
            case "Sep.":
            case "Nov.":
                System.out.println("30 ngay");
                break;
                
            default:
                System.out.println("Vui long nhap lai");
                break;
            
        }
        scanner.close();
    }    
}
