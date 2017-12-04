/* Abdur Khan, Rebecca Parker, Sam Schultz
* This class imports user's citations to an array list and adds HTML structure tags to each item in the array list
* as well as the larger structural HTML tags to make the citations and otherwise plain text readable as an HTML file. 
* The createFile method writes the citations to the HTML. 
* This class also gathers the citations statistics that are output to user at the termination of program.
* 
* Last updated 12/3/17
* 
*/

//import packages
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class MyCitations {
	
	private static final String FILENAME = "MyCitations.html";
	private int websiteCount;
	private int bookCount;
	private ArrayList<String> citations;
	

//constructor
	public MyCitations(){
		bookCount = 0;
		websiteCount = 0;
		citations = new ArrayList<String>();
	}

//keep track of book citations	
	public void increaseBookCount(){
		bookCount++;
	}

//keep track of web citations
	public void increaseWebsiteCount(){
		websiteCount++;
	}

//return count of book citations
	public int getBookCount(){
		return bookCount;
	}

//return count of web citations
	public int getWebsiteCount(){
		return websiteCount;
	}

//add citation to Arraylist
	public void addCitation(String s){
		citations.add(s);
	}

//create html file
	public String createFile(){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			String htmlTemplateStart = "<html><head><title>My Citations</title></head>\n<body><h1>My Citations</h1>";
			String htmlTemplateEnd = "</body></html>";
			
			bw.write(htmlTemplateStart);
			for (String arr : citations){
				bw.write("<p>" + arr + "</p>");
			}
			bw.write(htmlTemplateEnd);

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		String endingMessage;
		endingMessage = "Open MyCitations.html file in a browser to view citations.";
		return endingMessage;
	}
	
}
