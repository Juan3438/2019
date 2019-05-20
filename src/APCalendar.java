public class APCalendar
{

    private static int dayOfYear(int inMonth, int inDay, int inYear)
    {

        int  month, year, day,c;
        year = inYear;
        day = inDay;

        if (inMonth < 3) {
            year--;
            inMonth = inMonth +10;
        }
        else {
            inMonth = inMonth -2;
        }

        month = inMonth;


        c = year/100;
        year = year%100;

        int A = (int) (day+((2.6*month)-0.2)+year+(year/4)+(c/4)-(2*c));

        int x = A % 7;

        if (x < 0) {
            x+=7;
        }

        return x;
    }



    public static void main(String [] args)
    {
        System.out.println(dayOfYear(5,18,2019));
    }


}
