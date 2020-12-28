/*package whatever //do not write package name here */

import java.util.*;

  class G {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	   
	      int count=0;
	        int n=sc.nextInt();
	        int e=sc.nextInt();
	       
	       
	        boolean visited[]=new boolean[100005+1];
	        LinkedList<Integer> adj[]=new LinkedList[100005+1];
	      
	        for(int i=1;i<=n;i++)
	        {
	            adj[i]=new LinkedList<>();
	        }
	        for(int j=0;j<e;j++)
	        {
	      
	          
	           int x=sc.nextInt();
	           int y=sc.nextInt();
	          
	          adj[x].add(y);
	           adj[y].add(x);
	        }
	            
	            
	           
	    
	    for(int i=1;i<=n;i++)
	    {  if(visited[i]==false)
	        {dfs(i,visited,adj);
	        count++;}
	        
	    }
	   if(count==1 && e==n-1)
	    System.out.println("YES");
	    else
	    System.out.println("NO");
		
	}
	public static void dfs(int s,boolean visited[], LinkedList<Integer> adj[])
	{
	    visited[s]=true;
	    Iterator<Integer> i=adj[s].listIterator();
	    while(i.hasNext())
	    {
	        int ss=i.next();
	        if(!visited[ss])
	        dfs(ss,visited,adj);
	    }
	}
	
}