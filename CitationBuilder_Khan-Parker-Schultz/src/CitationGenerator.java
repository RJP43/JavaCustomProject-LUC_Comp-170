/* Abdur Khan, Rebecca Parker, Sam Schultz
 * This program takes inputs from users and generates citations from those inputs
 * Last updated 11/27/17
 * 
 * Prepare: Call Citation class to take user's inputs for author, date, etc.
 * Input: User inputs book/article/website information 
 * Process: Process inputs using Citation class, print citations to main screen to verify and add them to HTML file to export. Ask 
 * user if they'd like to generate another citation and repeat if Yes, end program if no.
 * Output: Print citations as generated and write them to an HTML file with the appropriate formatting. Print number of citations generated
 * when terminated
 */
import java.util.Scanner;

public class CitationGenerator {

	public static void main(String[] args) {
		Scanner userInput;
		userInput = new Scanner (System.in);
		
		//Declare variables for parts of citation
		String format;
		String author;
		String date;
		String sourceType;
	
		System.out.println("This program takes your inputs and compiles them into a bibliography in the form of an HTML file.");
		System.out.println("Follow program instructions: ");
		
		// Ask user which citation style they'd like to use
		System.out.println("Which format would you like your citations to be in? (MLA, APA, or Chicago)");
		format = userInput.nextLine();
		
		// Ask user what kind of source they're citing
		System.out.println("What kind of source are you citing? (Article, book, or website) ");
		sourceType = userInput.nextLine();
		
		//
		
		
		
	}

}

