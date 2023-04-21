package prime;

public class OneToHundred {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for (int o = 2; o < i; o++){
                if (i % o == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i + " ");
            }
        }
    }
}
