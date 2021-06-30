import java.util.Scanner;

class Bondinho{
    
  public static boolean teste(int a, int b){
      if((a<=50 && a>=1) && (b<=50 && b>=1)){
          return false;
      }
    return true;              
  }
    
  public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      boolean aprovadol = true;
      int a;
      int m;
      do{
        System.out.println("-- Digite números válidos, entre 1 e 50 --");
        System.out.println("Insira o número de alunos:");
        a = s.nextInt();
        System.out.println("Insira o número de monitores:");
        m = s.nextInt();
        aprovadol = teste(a,m);
      }while(aprovadol);

      if((a+m)<=50){
          System.out.println("S");
      }else{
          System.out.println("N");
      }
  }
}
