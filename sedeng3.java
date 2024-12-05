

import java.util.Random;
import java.util.Scanner;

    public class sedeng3 {
        public static void main(String[] args) {
            Scanner ks= new Scanner(System.in);
            Random rdm = new Random();
            String[] opera = {"*","/","%"};
        
        while (true) { 
            int pr=rdm.nextInt(49)+1;
            int kd=rdm.nextInt(50);
            String operasi = opera[rdm.nextInt(opera.length)];

            System.out.println(pr+" "+operasi+" "+kd+" =");
            double jb=ks.nextDouble();

                double benar = switch (operasi) {
                    case "*"-> pr * kd;
                    case "/"-> (double)pr/kd;
                    case "%"-> pr % kd;
                    default-> 0;

                };
            System.out.println(jb == benar? "mantap" : "salah wir "+benar);

            System.out.println("mau lanjut gk?(y/g)");
            if (ks.next().equals("g")) {
                break;
            }
        }
        System.out.println("makan tuh kuis!!!");
        }
    }
