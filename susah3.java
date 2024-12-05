public class susah3 {
    public static void main(String[] args) {
     
        String [] hawk = {"Skibidi ","sigma","rizz","rizz","sigma","mwing"};
        boolean [] printed= new boolean[hawk.length];
        
        
        System.out.println("data ini muncul: ");
            for (int k=0; k<hawk.length;k++) {
                if (!printed[k]) {
                    
                int umin=0;
                for (int q=0; q<hawk.length; q++) {
                    if(hawk[k].equals(hawk[q])) {
                        umin++;
                        printed[q]= true;
                    }
                }
                    
            System.out.println("ini "+ hawk[k]+" muncul "+umin+" kali");
            printed[k]=true;
            
            }
        }
            
       
                }
       
        }
    
    
