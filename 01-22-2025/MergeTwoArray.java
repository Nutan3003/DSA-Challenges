import java.util.*;
public class MergeTwoArray{
  public static void Merge(int a[],int b[],int ans[]){
    int n=a.length;
    int m=b.length;
    int p1=0;
    int p2=0;
    int p3=0;
    while(p1<n && p2<m){
        if(a[p1]<b[p2]){
            ans[p3]=a[p1];
            p1++;
        }else{
            ans[p3]=b[p2];
            p2++;
        }
        p3++;
    }
    while(p1<n){
        ans[p3]=a[p1];
        p1++;
        p3++;
    }
     while(p2<m){
        ans[p3]=b[p2];
        p2++;
        p3++;
    }
    
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int a[]=new int[n];
 int b[]=new int [m];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
 for(int i=0;i<m;i++){
    b[i]=sc.nextInt();
}


int ans[]=new int[n+m];
Merge(a,b,ans);
for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+" ");
}


}
}