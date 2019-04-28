package way2smstestng1;

public class ProgramOverload {

	
		public void add(long a,long b)
		{
		     long z=a+b;
		     System.out.println("aa======"+z);
				   
			//return z;
		}
		public void add(long a, int b) 
		{
		   long z=a+b ; 
		   System.out.println("bb======"+z);
				   
			//return z;
		}
		
		public static void main(String[] args) {
			
			ProgramOverload po=new ProgramOverload();
			
			po.add(100, 200);
			//System.out.println(a);
		}
		

	}


