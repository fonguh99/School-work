    import java.util.Scanner;

    public class grading{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the Exam Score: ");
            double examScore = scanner.nextDouble();

            System.out.println("Enter the Assessment Score: ");
            double assessmentScore = scanner.nextDouble();

            System.out.println("Enter amount of fees payed: ");
            double feesPayed = scanner.nextDouble();

        //logic
                boolean passExam = false;
                boolean passAssessment = false;
                boolean condoned = false;
                boolean getCertificate = false;
                boolean passedReq1 = false;
                boolean failed = false;
                boolean repeated = false;
        
    //REQ 1
            if (examScore >= 25){
                passExam = true;
            }

            if (assessmentScore >= 15){
                passAssessment = true;
            }

            if (passExam == true && passAssessment == true){
                passedReq1 = true;
            }


    //REQ 2
            if (examScore == 25 && assessmentScore == 14){
                condoned = true;
            }
            else if(examScore == 24 && assessmentScore == 15){
                condoned = true;
            }

    //REQ 3
            if (feesPayed == 100){
                if (passedReq1 == true || condoned == true){
                    getCertificate = true;
                }
            }

    //REQ 4
            if (passedReq1 == false && condoned == false){
                failed = true;
            }
            
    //REQ 5
            if (passExam == false && passAssessment == false){
                repeated = true;
            }
        
    //OUTPUTS
        
            //TOTALSCORE
            double totalScore = examScore + assessmentScore;
            System.out.println("Total Score : ", totalScore);

            //CERTIFICATE
            if(getCertificate == true){
                System.out.print("Student gets a certificate");
            }
            else{
                System.out.print("Student does not get a certificate");
            }

            //condoned
            if (condoned == true){
                System.out.println("Student is condened");
            }
            else {
                System.out.println("Student is not condoned");
            }
            // components
            if (passExam == true){
                System.out.println("Student passed in the Exam Component");
            }
            else {
                System.out.println("Student failed in the Exam Component");
            }

            if (passAssessment == true){
                System.out.println("Student passed in the Assessment Component");
            }
            else{
                System.out.println("Student failed in the Assessment Component");

            }

            //repeated
            if (repeated == true){
                System.out.println("Student is repeated");
            }
            else {
                System.out.println("Student is not repeated");
            }    
        }
    }