import  java.util.*;


class Poquemao{
  public static void main(String[] args){
    int contador = 0;
    int podem_evoluir=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Insira a quantidade de doces: ");    
    int n = s.nextInt();    
    ArrayList<Integer> pqms = new ArrayList<>();
    System.out.println("Insira a quantidade de doces necessárias para evoluir o primeiro poquemão: ");
    pqms.add(s.nextInt());
    System.out.println("Insira a quantidade de doces necessárias para evoluir o segundo poquemão: ");
    pqms.add(s.nextInt());
    System.out.println("Insira a quantidade de doces necessárias para evoluir o terceiro poquemão: ");
    pqms.add(s.nextInt());

    Collections.sort(pqms);
    
    for(int i: pqms){
        contador += i;
        if(contador <= n){
            podem_evoluir +=1;
        }
    }
    
    System.out.println(podem_evoluir);
        
    }
    
}
