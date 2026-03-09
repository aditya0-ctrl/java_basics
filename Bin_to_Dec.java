public class Bin_to_Dec {
    public static void Bin_toDec(int binnum) {
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        
        while (binnum>0) {
            int lastdig = binnum % 10;
            decnum=decnum +(lastdig*(int)Math.pow(2, pow));

            pow++;
            binnum=binnum/10;
            
        }
        System.out.println("decimal of " + mynum +" = " + decnum);
       }
       public static void main(String[] args) {
        Bin_toDec(102);
       }
       
        
       }
    
