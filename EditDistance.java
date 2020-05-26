import java.util.*;
 class EditDistance{

    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int t1 =sc.nextInt();
sc.nextLine();
for(int i1=0;i1<t1;i1++)
{
    String a=sc.nextLine();
    String b=sc.nextLine();
    int m=a.length();
    int n=b.length();
    
    int t[][]=new int[m+1][n+1];
    for(int i=0;i<=m;i++)
    {
        for(int j=0;j<=n;j++)
        {
            if(i==0)
            t[i][j]=j;
            if(j==0)
            t[i][j]=i;
        }
    }
    for(int i=1;i<=m;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(a.charAt(i-1)==b.charAt(j-1))
            t[i][j]=t[i-1][j-1];
            else
            t[i][j]=EditDistance.min((t[i][j-1]+1),(t[i-1][j]+1),(t[i-1][j-1]+1));}}
            
            System.out.println(t[m][n]);
            }}
            
            static int min(int x,int y,int z)
            {
                if(x<=y && x<=z)
                return x;
                if(y<=x && y<=z)
                return y;
                else
                return z;
            }
            
            
            
}
    

