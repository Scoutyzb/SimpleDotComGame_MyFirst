
public class SimpleDotComGame {
	public static void main(String[] args) {
		SimpleDotCom sim=new SimpleDotCom();
		int randomNum=(int)(Math.random()*5);
		int[] locationCells= {randomNum,randomNum+1,randomNum+2};
		sim.setLocationCells(locationCells);
		SimpleDotComHelper helper=new SimpleDotComHelper();
		
		String answer; 
		boolean isAlive = true;
		int num = 0;
		while(isAlive) {
			helper.setTheguessnumber();
			num++;
			String guess = helper.getTheguessnumber();
			answer=sim.checkYouself(guess);
			System.out.println(answer);
			if(answer.equals("Kill"))
				isAlive = false;
		}
		System.out.println("You have tried "+num+" times.");
	}
}
