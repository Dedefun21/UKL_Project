import java.util.Scanner;
    public class Uk1 {
        public static void main(String[] args) {
            Scanner jl= new Scanner(System.in);
            int pj,lb,tg;
            int km,bt,vl;

            System.out.println("beratnya?");
            bt=jl.nextInt();
            System.out.println("jaraknya?");
            km=jl.nextInt();
            System.out.println("volnya brp?");
            pj=jl.nextInt();
            lb=jl.nextInt();
            tg=jl.nextInt();
            vl=pj*lb*tg;
                

                    if (km <= 10) {
                        System.out.println("harga per kg: 4250");
                        long harga=bt*4250;
                     if (vl > 100) {
                        System.out.println("volume nya lebih wok");
                        long harga1=harga+50000;
                        System.out.println("nih harga "+harga1);

                    } 
                     else {
                        System.out.println("ini totalnya "+ harga);
                    }
                    }
                    if (km > 10) {
                        System.out.println("harga per kg: 6000");
                        long harga=bt*6000;
                        
                     if (vl > 100) {
                        System.out.println("volume nya lebih wok");
                        long harga1=harga+50000;
                        System.out.println("nih harga "+harga1);
                    } 
                     else {
                        System.out.println("ini totalnya "+ harga);
                    }
                    }
        }
    }