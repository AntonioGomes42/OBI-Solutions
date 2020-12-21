import java.util.*;

class fuga{
    
    public static int antiHorario(int h, int p, int f){
      int result = 0;
       while(true){
          f++;
          if(f==h){
              result = 1;
              break;
          }else if(f==p){
              result = 0;
              break;
          }
          if(f>15){
              f = 0;
          }    
       }
     
       return result;
      }    
    
    
    public static int horario(int h, int p, int f){
      int result = 0;
         while(true){
          f--;
          if(f==h){
              result = 1;
              break;
          }else if(f==p){
              result = 0;
              break;
          }
          if(f<0){
              f = 15;
          }    
       }
     return result;
    }     
    
    
    
    public static void main(String[] args){
        int h,p,f,d;
      
        Scanner s = new Scanner(System.in);
        System.out.println("Insira a posição do Helicoptero: ");
        h = s.nextInt();
        System.out.println("Insira a posição do Policial: ");
        f = s.nextInt();
        System.out.println("Insira a posição do Fugitivo: ");
        p = s.nextInt();
        System.out.println("Insira o sentido da fuga: ");
        System.out.println("1 - Sentido horário");
        System.out.println("2 - Sentido anti-horário");
        d = s.nextInt();
        
        boolean done = false;
            do{
                if (d == 1){
                    int t = horario(h,p,f);
                    if(t == 0){
                        System.out.println("N");
                          done = true;
                    }else if(t == 1){
                        System.out.println("S");
                          done = true;
                    }
                }else if(d == 2){
                    int t = antiHorario(h,p,f);
                    if(t == 0){
                        System.out.println("N");
                          done = true;
                    }else if(t == 1){
                        System.out.println("S");
                          done = true;
                    }
                }else{
                    System.out.println("Digite um número válido!");
                }
            }while(!done);   
    }
}
