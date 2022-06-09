package section04_conditional;

public class LeapYear {
    public static void main(String[] args) {
        var year = 2024;
  boolean isLeap;
  if(year%400==0) {
      isLeap = true;
  }
   else if (year%100==0){isLeap=false;
   }
   else if (year%4==0){isLeap=true;}
   else{isLeap=false;}
        System.out.println(isLeap? year+" is leap year":year+" is nor leap year");




    }
}
