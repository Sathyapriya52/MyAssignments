package myAssignments.week2.day1;

public class PrimeNumber 
{
	boolean num;
	int i;
	int count=0;
	public int number(int n)
	{
		
	
		 for(int i=2;i<n;i++)
		 {
			if(n%i==0) 
			{
				count++;
				num=true;
				if(count==1)
				{
					break;
			    }
				else 
				{
				num=false;
				}
		    }
		 }
		 System.out.println("Test3");
		 System.out.println(count);
		  if(n==1)
		       {
		    	   System.out.println("Given no. "+n+ " is not Prime");
		       }
		       else
		       {
					if(num==true)
					{
						System.out.println("Given no. "+n+ "is not Prime");
					}
					else
					{
						System.out.println("Given no. "+n+" is Prime");
					}
		       }
					return n;
					
			
		}
	
	
	public static void main(String[] args) 
	{
		
		PrimeNumber pn=new PrimeNumber();
		pn.number(25);		
	}

}

