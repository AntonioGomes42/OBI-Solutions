import java.util.Scanner;

public class gincana{

    public static long mdc (long a, long b){
        if (a%b == 0){
            return b;
        }else{
        return mdc(b,(a % b));
          } 
    }
    public static void main(String[] args){
        
        boolean done = false;

        long sn,sm,x,t;
        do{ 
            Scanner s = new Scanner(System.in); 
            System.out.println("Insira o valor de N:");
            sn = s.nextLong();
            System.out.println("Insira o valor de M:");
            sm = s.nextLong();
            x=sm;

            if(sn > (Math.pow(10, 18)) || sn < 0){
               System.out.println("Valor invalido. Insira um número entre 0 < N < 10¹⁸.");
            }else{
                if(sm > (Math.pow(10, 18)) || sm < 0){
                    System.out.println("Valor invalido. Insira um número entre 0 < M < 10¹⁸.");
                }else{
                        done = true;
                    }    
                }
            }while(!done);         
            
            for(long contador=x;contador>0;contador--){
                t = mdc(sn,x);
            if(t == 1){
                System.out.println("O valor de X é " + x);
                break;
            }else{
                x--;
            }
        }
    }  

}

   
