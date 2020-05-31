import java.util.*;
 class FAVDICE{

    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
    int n=sc.nextInt();
    float h=1;
    for(int j=2;j<=n;j++)
    {
        h+=(float)1/j;
    }
    double k=n*h;
    System.out.printf("%.2f",k);
    System.out.println();
}
    }
}
