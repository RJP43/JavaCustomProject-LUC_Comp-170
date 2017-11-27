import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class MyCitations {
	private static final String FILENAME = "MyCitations.html";

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			String htmlTemplateStart = "<html><head><title>My Citations</title></head>\n<body>";
			String content = "<em>Test<em>"; /*This variable will change to pull in the toString contents*/
			String htmlTemplateEnd = "</body></html>";

			bw.write(htmlTemplateStart);
			bw.write(content); /*This will print the toString contents*/
			bw.write(htmlTemplateEnd);

			System.out.println("Open MyCitations.html file in a browser to view citations.");

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}
