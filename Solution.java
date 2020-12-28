/*package whatever //do not write package name here */

import java.util.*;

  class Solution {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i1=0;i1<t;i1++)
	    {  int count=0;
	        int n=sc.nextInt();
	        int e=sc.nextInt();
	       
	       
	        boolean visited[]=new boolean[100005];
	        LinkedList<Integer> adj[]=new LinkedList[100005];
	      
	        for(int i=0;i<n;i++)
	        {
	            adj[i]=new LinkedList<>();
	        }
	        for(int j=0;j<e;j++)
	        {
	       //    String s=sc.nextLine();
	           
	       //     String str[]=s.split("");
	           
	       //   int x=Integer.parseInt(str[0]);
	       //     sc.nextLine();
	       //     int y=Integer.parseInt(str[1]);
	       //       sc.nextLine();
	          
	           int x=sc.nextInt();
	           int y=sc.nextInt();
	          
	          adj[x].add(y);
	           adj[y].add(x);
	        }
	            
	            
	           
	    
	    for(int i=0;i<n;i++)
	    {  if(visited[i]==false)
	        {dfs(i,visited,adj);
	        count++;}
	        
	    }
	   
	    System.out.println(count);
		
	}}
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