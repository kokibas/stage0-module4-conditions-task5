package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year % 4 ){
            case 1 :
                if (year % 100 == 0){
                    if (year % 400 ==0){
                        System.out.println("leap");
                    } else  {
                        System.out.println("not leap");
                    }
                }else {
                    System.out.println("leap");
                }

            case 2 :
                System.out.println("not leap");
            default :
                System.out.println("not leap");
        }
    }
}
