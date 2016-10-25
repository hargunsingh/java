import java.util.Arrays;
class Array1 {
		public static void main (String a[]){
				int i; 
				int[] ia ; ia = new int[21];
				
				ia[0] = 7;
				ia[1] = -7;
				ia[2] = 4;
				ia[3] = -4;
				ia[4] = -2;
				ia[5] = -1;
				ia[6] = 2;
				ia[7] = -6;
				ia[8] = -3;
				ia[9] = 1;
				ia[10] = -5;
				ia[11] = -8;
				ia[12] = -9;
				ia[13] = -10;
				ia[14] = 5;
				ia[15] = 3;
				ia[16] = 6;
				ia[17] = 8;
				ia[18] = 0;
				ia[19] = 9;
				
			
				
				System.out.println("Array unsorted\n");
				for (i = 0; i <=11; i++){
						System.out.print(ia[i]+' ');
				}
				System.out.println("\nArray unsorted\n");
				Arrays.sort(ia);
				for (i = 0; i <=11; i++){
						System.out.print(ia[i]+' ');
				}
				System.out.println();
	}
}
				
			
					  
