package evenorodd;

public class ToHundred {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
