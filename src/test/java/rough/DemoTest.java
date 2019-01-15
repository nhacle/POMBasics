package rough;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoTest {

	public static long fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main1(String[] args) {

		// WebDriver driver;
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir") +
		// "//src//test//resources//executables//chromedriver.exe");
		//
		// driver = new ChromeDriver();
		//
		// driver.get("https://mp3.zing.vn/");
		System.out.println(fibonacci(7));

	}

	public static void main01(String[] args) {
		ArrayList<Integer> arrListInteger = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int number; // phần tử của mảng

		System.out.println("Nhập số phần tử của ArrayList: ");
		int n = scanner.nextInt();

		// nhập và thêm phần tử cho ArrayList
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			number = scanner.nextInt();
			arrListInteger.add(number);
		}

		// tìm phần tử lớn nhất trong mảng
		// sử dụng phương thức compareTo()
		// giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
		int max = arrListInteger.get(0);

		for (int i = 1; i < arrListInteger.size(); i++) {
			// nếu kết quả của phép so sánh này lớn hơn 0
			// tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
			// thì gán max = phần tử tại vị trí i
			// và đó chính là phần tử lớn nhất
			if (arrListInteger.get(i).compareTo(max) > 0) {
				max = arrListInteger.get(i);
			}
		}
		System.out.println("Phần tử lớn nhất trong arrListInteger = " + max);
	}
}
