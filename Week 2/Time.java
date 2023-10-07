class Time {
   public static void main(String[] args) {
      int hour = 18;
      int minute = 34;
      int second = 55;
      
      System.out.print("Number of minutes since midnight: ");
      System.out.println(hour * 60 + minute);
      
      double secondsSinceMidnight = hour * 60 * 60 + minute * 60 + second;
      
      System.out.print("Number of seconds since midnight: ");
      System.out.println(secondsSinceMidnight);
      
      double secondsRemaining = 24 * 60 * 60 - secondsSinceMidnight;
      
      System.out.print("Numbers of seconds remaining in the day: ");
      System.out.println(secondsRemaining);
      
      
      System.out.println("Percentage of the day that has passed: " + secondsSinceMidnight / 86400 * 100 + "%");
      
      hour = 19;
      minute = 23;
      second = 12;
      
      double newTime = hour * 60 * 60 + minute * 60 + second;
      
      System.out.println("Time elapsed since working on this task is : " + (newTime - secondsSinceMidnight) + " seconds");
      
      
   }
}