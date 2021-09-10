import java.time.LocalDate;
import java.util.LinkedList;

public class q4_LinkedList {
    public static void main(String[] args) {

LinkedList<LocalDate> BirthDates = new LinkedList<>();
        BirthDates.add(LocalDate.of(2000,8,3));
        BirthDates.add(LocalDate.of(1998,4,27));
        BirthDates.add(LocalDate.of(2012,6,4));
        BirthDates.add(LocalDate.of(2007,1,10));
        BirthDates.add(LocalDate.of(2020,3,21));
        //System.out.println(BirthDates);
        for (LocalDate d:BirthDates)
        {
            if(d.isLeapYear())
                System.out.println(d+" is a Leap year. \n");
            else
                System.out.println(d+" is not a Leap year.");

        }


}
}
