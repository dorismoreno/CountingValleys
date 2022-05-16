
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String path="UDDDUDUU";
		    int steps=8;
		    countingValleys(steps,path);

	}
	public static int countingValleys(int steps, String path) {
	    // Write your code here
	    int countU=0;
	    int countD=0;
	    int numberOfVAlleys=0;
	  // HashSet<Character> my_map = new HashSet<Character>();
	    String temp="U";
	  
	    for(int i=0; i<path.length();i++){
	    	//compare each character of string path if contains 'U'
	      if( path.charAt(i)==temp.charAt(0))
	      {
	         countU++;  // IF TRUE COUNT INCREASES
	         //my_map.add(path.charAt(i)); // ADD TO MAP TO CHECK IF HAS DOWN STEP OR UPPER STEP
	      }
	      else{
	          countD++;// IF THERE IS DOWN STEP IT ONCREASES
	          //  my_map.add(path.charAt(i));// ALSO IT ADD TO THE MAP
	      }
	 // IF DOWN STEP AND UPPER STEP ARE THE SAME  AND THE LAST INDEX  IS UPPER AT THAT POINT, THERE IS A VALLEY.
	      if(countU==countD&&path.charAt(i)=='U'){
	         numberOfVAlleys++;
	        // my_map.clear();// RESET MAP FOR THE NEXT SUBARRAY
	         countU=0;// Reset countU to start new count of valley
	         countD=0;// Reset countD to start new count of valley
	      }
	    }
	    return numberOfVAlleys;// finally return the final number of valleys.
	    }


}
