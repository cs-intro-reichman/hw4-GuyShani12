public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count = 0;
        System.out.println("Prime numbers up to " + num + ":");

        for (int i = 2; i <= num; i++)
        {
            boolean b = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0){
                   b = false; 
                }
            }
            if (b == true){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + num + " (" + ((count * 100) / num) + "% are primes)");
    }
}