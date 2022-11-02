package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                month = 31;System.out.println(month);
                break;
            case 2 :
                month = 28;System.out.println(month);
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                month = 30;System.out.println(month);
                break;
            default :
                System.out.println("wrong number!");

        }
    }
}
