/*
Print all the possible permutations of an input string
_________________
Example-->

abc-->     a-bc	a-cb
	   b-ac b-ca
	   c-ba c-ab

-->keeping the left character fixed, we interchange the rest characters-->and then come back to our string
-->to keep the track of which characters to interchange ,we take l(eft) and r(ight) (two indices to know the range) as input
*/

public class AllStringPermutations
{
	static void permutation(String s , int l , int r)
	{
		if(l==r)
		{
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s=interchange(s,l,i);//intechanging
			permutation(s,l+1,r);//passing the smaller string now as l+1
			s=interchange(s,l,i);//interchanging again--->called backtracking
		}
	}

	static String interchange(String s, int a,int b)
	{
		char arr[]=s.toCharArray();
		char temp= arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return String.valueOf(arr);
	}
	public static void main(String args[])
	{
		permutation("abcc",0,3);
	}
}
