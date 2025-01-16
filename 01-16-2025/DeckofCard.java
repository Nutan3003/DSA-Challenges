import java.util.HashMap;
import java.util.*;
public class DeckofCard {
 public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        int temp=gcd(b%a,a);
        return temp;
    }
    public static  boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=deck.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(deck[i])==false){
                map.put(deck[i],1);
            }else{
                int temp=map.get(deck[i]);
                map.put(deck[i],temp+1);
            }
        }
        int ans=0;
        for(int k:map.keySet()){
            ans=gcd(ans,map.get(k));
        }
        if(ans==1){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int deck[]=new int[n];
      for(int i=0;i<n;i++){
        deck[i]=sc.nextInt();
      }
      System.out.println(hasGroupsSizeX(deck));

    }
}
