
public class SimpleDotCom_Test {
	public static void main (String args[]) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations= {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYouself(userGuess);
		String testResult = "failed";
		if (result.equals("Hit")) {
			testResult = "passed";
		}
		System.out.println(testResult);
	}
}