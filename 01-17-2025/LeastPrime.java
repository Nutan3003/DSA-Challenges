import java.util.*;
public class LeastPrime {
  public static int[] leastPrimeFactor(int n)
    {
        int [] spf=new int[n+1];
        
        for(int i=1;i<=n;i++){
            spf[i]=i;
        }
        spf[0]=0;
        spf[1]=1;
        
        for(int j=2;j*j<=n;j++){
            if(spf[j]==j){
                for(int i=j*j;i<=n;i+=j){
                    if (spf[i] == i) { 
                        spf[i] = j;
                    }
                }
            }
        }
        
        return spf;
    }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(leastPrimeFactor(n));
  }
}
