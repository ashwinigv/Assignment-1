
public class IneuronPattern {
	
public static void main(String[] args) 
{
			int n = 10;
			for(int i=0;i<=n;i++) 
				{
				// Print I letter
					for(int j=0;j<=n;j++) 
					{
					if(i==0 || j==n/2 || i==n)
						System.out.print("I");
					else
						System.out.print(" ");
					}
					
					System.out.print("   ");
					// print N letter
					for(int j =0;j<=n;j++)
					{
						if(j==0||i==j || j==n)
							System.out.print("N");
						else
							System.out.print(" ");
					}
					System.out.print("   ");
					
					// Print E letter
					for(int j =0;j<=n;j++)
					{
						if(j==0||i==0&&j<=n/2 ||i==n/2&&j<=n/2 || i==n&&j<=n/2)
							System.out.print("E");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
					// print U letter
					for(int j =0;j<=n;j++)
					{
						if(j==0&&i!=n||(j==3*n/4&&i!=n)||i==n&&j!=0&&j<3*n/4)
							System.out.print("U");
						else
							System.out.print(" ");
					}
					System.out.print("   ");
					// print R letter
					for(int j =0;j<=n;j++)
					{
						if(j==0 ||i==0&&j<3*n/4 ||j==3*n/4&&i<n/2 ||i-j==0&&j>=n/2&&i>=n/2||i==n/2&&j<3*n/4)
							System.out.print("R");
						else
							System.out.print(" ");
					}
					System.out.print("   ");
					// Print O letter
					for(int j =0;j<=n;j++)
					{
						if((i==0&&j!=3*n/4&&j!=0&&j<3*n/4)||(j==3*n/4&&i!=0&&i!=n)||(i==n&&j<3*n/4&&j!=0)||(j==0&&i!=0&&i!=n))
							System.out.print("O");
						else
							System.out.print(" ");
					}
					System.out.print("   ");
					// Print N letter
					for(int j =0;j<=n;j++)
					{
						if(j==0||i==j || j==n)
							System.out.print("N");
						else
							System.out.print(" ");
					}
					System.out.print("   ");
			System.out.println();
				
				
		}
	}
	}		
		
		
	
