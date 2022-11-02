package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
       switch (number){
           case 2 :
           case 3 :
           case 4 :
           case 7 :
           case 8 :
           case 9 :
               System.out.println(number);
               break;
           default :
               System.out.println("out of range");
       }
    }
}
