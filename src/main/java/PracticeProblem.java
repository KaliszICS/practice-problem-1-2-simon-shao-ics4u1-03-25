public class PracticeProblem {

	public static void main(String args[]) {
	}
public static boolean validIndex(int[] numArr, int num){
	try{
numArr[num] =0;
	}
	catch(ArrayIndexOutOfBoundsException e){
		return false;
	}
	return true;
}
	

public static int divide(int num, int num1){
try{
	return num / num1;
}
catch(ArithmeticException e){
	return 0;
}
}


public static int safeConvertStringtoInt(String word){
try {
	return Integer.parseInt(word);
}
catch (NumberFormatException e){
	return 0;
}
}

}
