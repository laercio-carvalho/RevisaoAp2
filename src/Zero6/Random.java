package Zero6;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();

        for (int i = 0; i < 10000; i++) {
            int b = sr.nextInt(20);
            if (b>=19){
                System.out.println("Texto 01 "+b);
                return;
            }
            System.out.println("Texto 02: "+b);
        }
    }
}
