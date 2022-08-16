package testdate;

public class NextDayCalculator {

    public static final String CONCATENATION = "/";
    public static final int FIRSTDAYOFMONTH = 1;


    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        String result;
        int lastOfMonth = getLastOfMonth(monthTest);
        int lastOfYear= 12;
        boolean leapYear = isLeapYear(yearTest);
      if( leapYear==true) {
          dayTest= getLastOfMonth(monthTest)+1;
            result= FIRSTDAYOFMONTH + CONCATENATION + (++monthTest) +CONCATENATION+yearTest;
        }
        else if (dayTest == lastOfMonth &&monthTest== lastOfYear) {
            result= FIRSTDAYOFMONTH+CONCATENATION + FIRSTDAYOFMONTH+CONCATENATION+ ++yearTest;
        } else if(dayTest== lastOfMonth){
            result= FIRSTDAYOFMONTH + CONCATENATION + (++monthTest) + CONCATENATION + yearTest;
        }
        else {
            result = ++dayTest + CONCATENATION + monthTest + CONCATENATION + yearTest;

        }

        return result;
    }



    private static boolean isLeapYear(int yearTest) {
        if (yearTest % 4 == 0) {
            if (yearTest % 100 == 0) {
                if (yearTest % 400 == 0)
                    return true;
                else
                    return false;
            } else
                return true;
        }else
                return false;
        }

    private static int getLastOfMonth(int monthTest) {
        int lastOfMonth=0;
        switch (monthTest){
            case 1:
                lastOfMonth=31;
                break;
            case 2:
                lastOfMonth=28;
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth=31;
                break;
            default:
                lastOfMonth=30;

        }
        return lastOfMonth;
    }
}
