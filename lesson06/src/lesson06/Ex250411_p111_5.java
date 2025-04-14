package lesson06;

public class Ex250411_p111_5 {
	public static void main(String[] args) {
	
//	*****
//	****
//	***
//	**
//	*
	
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(i + j <=4) {
				System.out.printf("(%d,%d)", i, j);
			}
			else {
//				System.out.printf("%5c",'');
			}
		}
		System.out.println("");
	}
//		*
//	   ***
//	  *****
//	   ***
//	    *
		
		for(int i = -2 ; i < 3 ; i++) {
			for(int j = -2 ; j < 3 ; j++) {
				if(i * j < 2 && i * j > -2) {
					System.out.printf("(%2d,%2d" , i, j);
				}
				else {
//					System.out.printf("%7c" , '');
				}
			}
			System.out.println();
		}
		
	}
}
