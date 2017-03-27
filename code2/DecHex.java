class DecHex {
	public static void main (String args[]){
		int d;
		int h16, h1;
		String hex[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		
		String nibble[] = {
			"0000","0001","0010","0011","0100","0101","0110","0111",
			"1000","1001","1010","1011","1100","1101","1110","1111"
		};
		
		for (d = 0; d <256; d ++){
				h16 = (int)(d / 16);
				h1 = (int)(d % 16);
				//System.out.println(d + " = "+" h16 "+ h16 +" h1 "+h1);
				//System.out.println(h16+" "+h1);
				//System.out.print(d+"= ");
				//System.out.println(nibble[h16]+ " "+nibble[h1]+" ");
				System.out.println(hex[h16]+hex[h1]+":"+nibble[h16]+" "+nibble[h1]);
			}
		}
	}	
