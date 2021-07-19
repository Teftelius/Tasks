import java.util.Calendar;
import java.util.GregorianCalendar;

public class AmountOfSundays {
    private GregorianCalendar firstDate;
    private GregorianCalendar secondDate;



    public void setFirstDate(String date) {
        if (date != null) {
            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 5)) - 1;
            int year = Integer.parseInt(date.substring(6));
            firstDate = new GregorianCalendar(year, month, day);
        } else System.out.println("Error!");
    }

    public void setSecondDate(String date) {
        if (date != null) {
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5)) - 1;
        int year = Integer.parseInt(date.substring(6));
        secondDate = new GregorianCalendar(year, month, day);
        } else System.out.println("Error!");
    }

    /*public Date getFirstDate() {
        Date strFirstDate = firstDate.getTime();
        System.out.println(firstDate.getMaximum(Calendar.WEEK_OF_YEAR));
        /*strFirstDate += Integer.toString(firstDate.get(Calendar.DAY_OF_MONTH));
        strFirstDate += DELIMITER + Integer.toString(firstDate.get(Calendar.MONTH));
        strFirstDate += DELIMITER + Integer.toString(firstDate.get(Calendar.YEAR));

        return strFirstDate;
    }*/

   /* public Date getSecondDate() {
        Date strSecondDate = secondDate.getTime();
        System.out.println(firstDate.getMaximum(Calendar.WEEK_OF_YEAR));
        /*
        strSecondDate += Integer.toString(secondDate.get(Calendar.DAY_OF_MONTH));
        strSecondDate += DELIMITER + Integer.toString(secondDate.get(Calendar.MONTH));
        strSecondDate += DELIMITER + Integer.toString(secondDate.get(Calendar.YEAR));

        return strSecondDate;
    }*/

    public int getAmountOfSundays() {
        int aos = 0;


        int days = getNumbsOfDays(secondDate,firstDate);
        if (days < 7) {
            if ((firstDate.get(Calendar.DAY_OF_WEEK) + days) > 8) return aos = 1;
            else return aos = 0;
        }
        aos += (int)Math.ceil((double) days/7);

        return aos;
    }

    private int getNumbsOfDays(GregorianCalendar obj2, GregorianCalendar obj1) {
        int days = (int) ((obj2.getTimeInMillis() - obj1.getTimeInMillis()) / (24 * 60 * 60 * 1000)) +1;
        return days;
    }
}

