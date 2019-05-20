public class APCalendar
{

    private static int dayOfYear(int month, int day, int year)
    {
        return r(1+5* r(year - 1,4 ) + 4 * r(year-1,100) + 6*r(year-1,400),7);
    }



    public static void main(String [] args)
    {
        System.out.println(dayOfYear(5,1,2019));
    }
    private static int r(int x,int y)
    {
        return x%y;
    }

}
