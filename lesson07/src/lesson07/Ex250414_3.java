package lesson07;

public class Ex250414_3 {
	public static void main(String[] args) {
		// 3. 2차원 배열

		// **
		// **
		// **
		// *****
		// *****
		
		char[][] chs = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};

		// 90도 시계 방향 회의 결과를 result에 담으시오
		char[][] result2 = new char[5][5];
		for(int i = 0 ; i < chs.length ; i++) {
			for(int j = 0 ; j < chs.length ; j++) {
				System.out.print(chs[i][j] + " ");
				result2[j][5-1-i] = chs[i][j];
			}
			System.out.println();
		}
		
		for(char[] t : result2) {
			for(char n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		int[][] val = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] result = new int[3][3];
		
		result[0][2] = val[0][0]; // 1
		result[1][2] = val[0][1]; // 2
		result[2][2] = val[0][2]; // 3
		
		result[0][1] = val[1][0]; // 4
		result[1][1] = val[1][1]; // 5
		result[2][1] = val[1][2]; // 6
		
		result[0][0] = val[2][0]; // 7
		result[1][0] = val[2][1]; // 8
		result[2][0] = val[2][2]; // 9
		
		
		for(int i = 0 ; i < val.length ; i++) {
			for(int j = 0 ; j < val.length ; j++) {
				System.out.print(val[i][j] + " ");
				result[j][3-1-i] = val[i][j];
			}
			System.out.println();			
		}
		
		for(int[] t : result) {
			for(int n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
		/*
		 *  1 2 3
		 *  4 5 6
		 *  7 8 9
		 */
		
		
		
		
		
		
		
		}
	
	
	
}
