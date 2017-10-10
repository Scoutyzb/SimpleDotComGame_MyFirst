
public class SimpleDotCom {
	private int[] locationCells;
	int numOfHits=0;
	public String checkYouself(String stringGuess) {
		 int guess = Integer.parseInt(stringGuess);
		 String result = "Miss"; 
		 for (int cell: locationCells) {
		 if (guess == cell) {
			 result = "Hit";
			 numOfHits++;
			 break;}
	}
	if (numOfHits == locationCells.length) {
		result = "Kill";
	}
		return result;
	}
	public int[] getLocationCells() {
		return locationCells;
	}
	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}
}
