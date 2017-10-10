import java.util.Scanner;
public class SimpleDotComHelper {
	private String theguessnumber;
	Scanner sc = new Scanner(System.in);
	public String getTheguessnumber() {
		return theguessnumber;
	}

	public void setTheguessnumber() {
		System.out.print("please input the number:");
		String number=sc.nextLine();
		this.theguessnumber = number;
	}
	
}
