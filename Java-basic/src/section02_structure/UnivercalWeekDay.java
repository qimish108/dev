package section02_structure;

/*public class UnivercalWeekDay {
    public static void main(String[] args) {
        var day = 5;
        var isMondayFirst = true;
        var internalDay = day;
        if (!isMondayFirst) {
            internalDay--;
            if (internalDay == 0) ;
            {
                internalDay = 7;
            }
        }*/

        public class UnivercalWeekDay {
    public static void main(String[] args) {
        // read source data
        var day = 1;
        var isMondayFirst = false;

        // processing
        var internalDay = day;
        if (!isMondayFirst) {
            internalDay--;
            if (internalDay == 0) {
                internalDay = 7;
            }
        }




        String result;
        if (internalDay == 1) {
            result = "Monday";
        } else if (internalDay == 2) {
            result = "Tuesday";
        } else if (internalDay == 3) {
            result = "Wednesday";
        } else if (internalDay == 4) {
            result = "Thursday";
        } else if (internalDay == 5) {
            result = "Friday";
        } else if (internalDay == 6) {
            result = "Saturday";
        } else if (internalDay == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day: " + day;
        }
        System.out.println(result);
    }
}

