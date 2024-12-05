import java.util.Scanner;
    public class susah1{
        public static void main(String[] args) {
            
        
            
        Scanner px = new Scanner(System.in);

        System.out.println("sebutkan jumlah siswa ");
        int jm=px.nextInt();

        

        double[] nai = new double[jm];   

        for (int x =0;x <nai.length; x++) {
            System.out.println("siswa "+(x+1)+" nilainya");
            nai[x]=px.nextDouble();
        }
        double totl=0;
        for (int t=0; t<nai.length; t++) {
            totl += nai[t];
        }
        System.out.println("total nilai kelas "+ totl);
        double ratn=totl / jm;
        System.out.println("rata rata nilainya "+ratn);

        }
    }