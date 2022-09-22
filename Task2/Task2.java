class Task2 {
	
public static void main(String[] args) {
	System.out.println(printPartOfWord("Jimmy", 2, 2));
	

}

public static String printPartOfWord(String word, int i, int l) {

return word.substring(i, i+l);


}


}