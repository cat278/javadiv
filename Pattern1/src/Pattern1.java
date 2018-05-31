

public class Pattern1 {
	public static void main(String[] args) {
	for(int i=1; i<=4; i++) 
	{
	for (int j=1;j<=4;j++)
      {
		//System.out.printf("* ");
		if(j==1||i==4||j==4||i==1)
		System.out.printf("* ");

		else 
			System.out.printf("  ");//2
		}
		 
	System.out.printf(" \n");
	}
	}

}

