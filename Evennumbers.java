import java.util.*;
 class Evennumbers{

    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
    int n=sc.nextInt();
    String s=Integer.toBinaryString(n);
    StringBuilder sb=new StringBuilder(s);
    sb.reverse();
    String h=sb.toString();
    int decimal=Integer.parseInt(h,2);
    
    
    
    
    if(n%2==0)
    System.out.println(decimal);
    else
    System.out.println(n);
}

    }
}
