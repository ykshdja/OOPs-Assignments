import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;
public class HeartRate {

   private String fname;
   private String lname;
    private int birthMonth;
    private int birthDay;
    private int birthYear;


    public HeartRate(String fname,String lname, int birthMonth, int birthDay, int birthYear){
        this.fname = fname;
        this.lname = lname;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
    /**Getter*/
    public String getfName()  { return fname; }
    public String getlname() { return lname;}
    public int getBirthMonth() { return birthMonth; }
    public int getBirthDay() { return birthDay;   }
    public int getBirthYear() { return birthYear;  }
    /* Setters */
    public void setFirstName(String fname) { this.fname = fname; }
    public void setLastName(String lname)   { this.lname  = lname;  }
    public void setBirthMonth(int birthMonth)  { this.birthMonth = birthMonth; }
    public void setBirthDay(int birthDay)      { this.birthDay   = birthDay;   }
    public void setBirthYear(int birthYear)    { this.birthYear  = birthYear;  }

        public int getAge() {
        java.util.Calendar today = java.util.Calendar.getInstance();
        int age = today.get(java.util.Calendar.YEAR) - birthYear;
        
        if (today.get(java.util.Calendar.MONTH) + 1 < birthMonth ||
           (today.get(java.util.Calendar.MONTH) + 1 == birthMonth &&
            today.get(java.util.Calendar.DAY_OF_MONTH) < birthDay)) {
            age--;
        }
        return age;
    }

     public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        int max = getMaximumHeartRate();
        int low = (int) Math.round(max * 0.50);
        int high = (int) Math.round(max * 0.85);
        return low + " - " + high + " bpm";
    }

       @Override
    public String toString() {
        return fname + " " + lname +
               " (DOB: " + birthMonth + "/" + birthDay + "/" + birthYear + ")";
    }


}