import java.util.*;						

class FindAndFixErrorMethod{
	public static void main(String[] args)	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a String and I will tell you the number of occurrences of every letter  ");
		String temp = in.nextLine(); //incorrect type
		int count;
		for(char c='a';c<='z';c++) {
			countOccurrences(temp, c);	  // incorrect parameters
		}
	}
	
	
	public static void countOccurrences(String temp, char c) {
      //delete temp and use count instead
      int count = 0;
		for(int i=0;i<temp.length();i++) {
			if(c == temp.toLowerCase().charAt(i)) {
            count++;
         }
		}
		if(count>0) {
         System.out.println(c + " appears " + count + " times"); //needs to be it's own block 
      }
	}
}