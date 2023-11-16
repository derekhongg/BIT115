public class TestCommision {
   public static void main (String[] args) {
      //Creating sales table
      System.out.println("\n SalesAmount     Commission");
      for (double salesAmt = 10000; salesAmt <= 100000; salesAmt += 5000) {
			System.out.printf(" %-16.0f", salesAmt);
			System.out.printf("%8.1f\n", calcCommission(salesAmt));
		}
   }
   
    public static double calcCommission(double salesAmt) {
        double commissionRate = 0;
 
        if (salesAmt >= 0.01 && salesAmt <= 5000) {
            commissionRate = salesAmt * 0.08;
        }
        // Set first 5000 salesAmt to 8 percent,
        // then remaining (salesAmt-5000) to 10 percent
        else if (salesAmt >= 5000.01 && salesAmt <= 10000) {
            commissionRate = 5000 * 0.08;
            commissionRate += (salesAmt - 5000) * 0.10;
        }
        // Set first 5000 salesAmt to 8 percent, then nest 5000 to 10 percent
        // then remaining (salesAmt-10000) to 12 percent
        else if (salesAmt >= 10000.01) {
            commissionRate = 5000 * 0.08 + 5000 * 0.10;
            commissionRate += (salesAmt - 10000) * 0.12;
        }
        return commissionRate;
   }
}