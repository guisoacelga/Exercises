public class ExPingPong {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 100){

            if (i % 6 == 0){
                System.out.println(i + " ping pong");
            } else if (i % 2 == 0){
                System.out.println( i +" ping");
            } else if (i % 3 == 0){
                System.out.println(i+ " pong");
            } else {
                System.out.println(i+ " -");
            }

            i++;
        }
    }
}
