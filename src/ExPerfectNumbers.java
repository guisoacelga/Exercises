public class ExPerfectNumbers {

        public static void main(String[] args) {
            for (int i = 0; i <= 100000000L ; i++) {
                if (isPerfectNumber(i))
                System.out.println( i + " is a perfect number.");
            }
        }

        public static boolean isPerfectNumber(int number){

            if ( calculateRealDivisors(number)== number){
                return true;
            }
            return false;

        }

        public static int calculateRealDivisors (int number){
            int counter;
            int sum = 0;

            for (counter =1; counter <= number / 2; counter++){
                if (number % counter == 0){
                    sum = sum + counter;
                }
            }

            return sum;

        }




}

