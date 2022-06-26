package sikuli.sikuli;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;

import java.net.URISyntaxException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class Notepad {
	public static void main(String[] args) throws InterruptedException, FindFailed {
		ImagePath.add(System.getProperty("user.dir"));
		Thread.sleep(10000);

		try {
			//App class opens app and brings it into focus
			App test = new App();
			test = App.open("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
			test.focus();
			System.out.println(test.getName());
			
			//Screen class grabs elements based on images
			Screen s = new Screen();
			Pattern file = new Pattern("file.png");
			s.wait(file, 10);
			s.click(file);
			
			Thread.sleep(1000);
			
			Screen s2 = new Screen();
			Pattern newDoc = new Pattern("newDoc.png");
			s2.wait(newDoc, 10);
			s2.click(newDoc);
			
			Thread.sleep(1000);
			
			Screen s3 = new Screen();
			Pattern textField = new Pattern("textField.png");
			s3.wait(textField, 10);
			s3.click(textField);
			
			Thread.sleep(1000);
			
			s3.write("hello world");
	
		} catch (Error e) {
			e.printStackTrace();
		}
	}
}
