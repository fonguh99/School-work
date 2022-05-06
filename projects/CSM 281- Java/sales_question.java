
public class sales_question {

	    public static void main(String[] args) {
		    int [][] highStreet = {{42000, 48000, 50000,}, {52000, 58000, 60000,}, {46000, 49000, 58000}, {50000, 51000, 61000}};
	        int [][] mallBranch = {{5700, 63000, 60000,}, {70000, 67000, 73000}, {67000, 65000, 62000,}, {72000, 69000, 75000}};

	        String[] months = {"January", "February", "March", "April", "May", "May", "May", "June",
	        "July", "August", "september", "October", "November","December"};

	        int[] quarterlySales = new int[4];
	        int[] monthlySales = new int[12];
	        int highStreet_YearlySales = 0;
	        int mallBranch_YearlySales = 0;
	        int sum = 0;
	        int quarter = 0;
	        int currentMonth = 0;

	        for(int i = 0; i<highStreet.length; i++){
	            for(int j = 0; j<highStreet[j].length; j++ ){
	                highStreet_YearlySales += highStreet[i][j];
	                mallBranch_YearlySales += mallBranch[i][j];
	                sum = highStreet[i][j] + mallBranch[i][j];
	                monthlySales[currentMonth] = sum;
	                quarter += sum;
	                currentMonth++;
	            }
	            quarterlySales[i] = quarter;
	            quarter = 0;
	        }

	        System.out.println("monthly sales");
	        for(int i = 0; i<monthlySales.length; i++){
	            System.out.println(months[i] + ":" +monthlySales[i]);
	        }
	        for(int i = 0; i<quarterlySales.length; i++) {
	            System.out.println("Quarter" + (i + 1) + ":" + quarterlySales[i]);
	        }
	        System.out.println("High Street Branch Annual sales is" +  highStreet_YearlySales);
	        System.out.println("Mall Branch Annual sales is" + mallBranch_YearlySales);
	        System.out.println("The grand annual sales is" + (highStreet_YearlySales + mallBranch_YearlySales));


	    }

	}


