class hollowInvertedHalfPyramid{
public static void main(String args[]){
	for(int i=1;i<=6;i++){
		for(int j=1;j<=6;j++){
			if((j==7-i&&i==i)||j==1||i==1){
				System.out.print("*"+" ");
			}
			else{
				System.out.print(" "+" ");
			}
		}
		System.out.println();
	}
}
}