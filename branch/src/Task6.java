import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		//標準入力
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		//条件分岐
		String output ="";
		if(number == 1) {
			output = "Ⅰ";
		}else if(number == 2) {
			output = "Ⅱ";
		}else if(number == 3) {
			output = "Ⅲ";
		}else if(number == 4) {
			output = "Ⅳ";
		}else if(number == 5) {
			output = "Ⅴ";
		}else {
			output = "unknown";
		}
		//結果の出力
		System.out.println(number + " ->" + output);
		switch(number) {
			case 1:
				output = "Ⅰ";
				break;
			case 2:
				output = "Ⅱ";
				break;
			case 3:
				output = "Ⅲ";
				break;
			case 4:
				output = "Ⅳ";
				break;
			case 5:
				output = "Ⅴ";
				break;
			default:
				output = "unknown";

		}
		System.out.println(number + " ->" + output);




	}

}
