package conditionalsOne;

public class ConditionalsOne {
	public static void main(String[] args) {
		
		System.out.println(multiply(10, 15, true));
		
	}
	
	public static int multiply(int firstNum, int secondNum, boolean isMultiply) {
		if (isMultiply) {
			return firstNum + secondNum;
		}
		else {
			return firstNum*secondNum;
		}
	}
	
}