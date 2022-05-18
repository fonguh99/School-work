public class Monthly_sales {

    public static void main(String[] args) {
        int[][] hsb = { { 42000, 48000, 50000 },
                { 52000, 58000, 60000 },
                { 46000, 49000, 58000 },
                { 50000, 51000, 61000 }
        };
        int[][] mb = { { 57000, 63000, 60000 },
                { 70000, 67000, 73000 },
                { 67000, 65000, 62000 },
                { 72000, 69000, 75000 } };
        int[] months = new int[12];
        int[] quarter_hsb = new int[4];
        int[] quarter_mb = new int[4];
        int[] totals = new int[4];
        int annuals_hsb = 0;
        int annuals_mb = 0;
        int total_annuals = 0;
        int mc = 0;
        int max = 0;
        String bm = "";
        int maxm = 0;
        String bq = "";
        for (int r = 0; r < hsb.length; r++) {
            for (int c = 0; c < hsb[r].length; c++) {
                months[mc] = hsb[r][c] + mb[r][c];
                // System.out.println(months[mc]);
                mc++;
                quarter_hsb[r] += hsb[r][c];
                quarter_mb[r] += mb[r][c];
                annuals_hsb += hsb[r][c];
                annuals_mb += mb[r][c];
                if (mb[r][c] > max) {
                    max = mb[r][c];
                    bm = "MB";
                }
                if (hsb[r][c] > max) {
                    max = hsb[r][c];
                    bm = "HSB";
                }
                if (quarter_hsb[r] > maxm) {
                    maxm = quarter_hsb[r];
                    bq = "HSB";
                }
                if (quarter_mb[r] > maxm) {
                    maxm = quarter_mb[r];
                    bq = "BM";
                }
            }
            totals[r] += quarter_hsb[r] + quarter_mb[r];
            System.out.println(quarter_hsb[r]);
            System.out.println(quarter_mb[r]);
            // System.out.println(totals[r]);
        }
        total_annuals = annuals_hsb + annuals_mb;
        // System.out.println(total_annuals);
        if (annuals_hsb > annuals_mb) {
            System.out.println("HSB performed better");
        } else {
            System.out.println("MB performed better");
        }
        // System.out.println(annuals_hsb);
        // System.out.println(annuals_mb);
        System.out.println("The best month is " + max + " from " + bm);
        System.out.println("The best month in terms of quarterly performance is " + maxm + " from " + bq);
    }
}
