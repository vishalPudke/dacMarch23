class hollowfullPyramid{
	public static void main(String args[]){
		for(int i=1;i<=6;i++){
			for(int k=5;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if((j==i)||j==1||i==6){
					System.out.print(" *");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

			
