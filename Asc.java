// file: Asc.java
class Asc {
    public static void main (String a[]){
        //variables
        int i;// integer i
        char c;// character c
        //for loop
        for (i = 0; i < 256; i++){
			c = (char)i;
			System.out.print(i);
			System.out.print(" ");
			System.out.print(c);
            System.out.print(" ");
        }
    }
}



