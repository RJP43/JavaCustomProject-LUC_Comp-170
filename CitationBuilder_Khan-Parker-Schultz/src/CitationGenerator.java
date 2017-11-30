/* Abdur Khan, Rebecca Parker, Sam Schultz
 * This program takes inputs from users and generates citations from those inputs
 * Last updated 11/29/17
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
		
		String response;
		
		//Declare variables for parts of citation
		String format;
		String sourceType;
		String authorFName;
		String authorLName;
		String author2FName;
		String author2LName;
		String authorTwo;
		String title;
		String publisher;
		String city;
		String website;
		String webPublishDate;
		String webAccessDate;
		String url;
		int yearBookPublished;
	
		System.out.println("Cite Before You Write!");
		System.out.println("This program takes your inputs and compiles them into a bibliography in the form of an HTML file.");
		System.out.println("Follow program instructions: ");
		
//		// Ask user which citation style they'd like to use
//		System.out.println("Which format would you like your citations to be in? (MLA, APA, or Chicago)");
//		format = userInput.nextLine();
//		// If we included all three formats, we would have conditionals splitting the program here for all three formats.
		
		do {
		// Ask user what kind of source they're citing
		System.out.println("What kind of source are you citing? (Book or website) ");
		sourceType = userInput.nextLine();
		// Two source types for testing for now
		
		if (sourceType.equalsIgnoreCase("book")){
			// Ask for author first name
			System.out.println("Enter the author's first name.");
			authorFName = userInput.nextLine();
		
			// Ask for last name
			System.out.println("Enter the author's last name.");
			authorLName = userInput.nextLine();
		
//			// If another author
//			System.out.println("Is there another author? ");
//			authorTwo = userInput.nextLine();
//			if (authorTwo.equalsIgnoreCase("yes")){
//				System.out.println("Enter the second author's first name.");
//				author2FName = userInput.nextLine();
//				author2LName = userInput.nextLine();
//			}
			
			// Ask for title
			System.out.println("Enter the title of your source.");
			title = userInput.nextLine();
			
			// Ask for publisher
			System.out.println("Enter the publisher of your source.");
			publisher = userInput.nextLine();
			
			// Ask for city of publication
			System.out.println("Enter the city the book was published in.");
			city = userInput.nextLine();
			
			// Ask for date published
			System.out.println("Enter the year the book was published.");
			yearBookPublished = userInput.nextInt();
			
			//blank input to avoid skipped line bug
			userInput.nextLine();
			
			Citation bookCitation;
			bookCitation = new Citation(title, authorFName, authorLName, publisher, yearBookPublished, city);
			System.out.println(bookCitation.bookToString());
			
		}
		else if ((sourceType.equalsIgnoreCase("website"))){
			//Ask for website URL
			System.out.println("Enter the URL of the website.");
			url = userInput.nextLine();
		
			//Ask for website publish date
			System.out.println("Enter the publish date of the website, if available.");
			webPublishDate = userInput.nextLine();
			
			//Ask for website access date
			System.out.println("When did you access this site?");
			webAccessDate = userInput.nextLine();
		}
		
		
		System.out.println("Would you like to run the program again? ");
		response = userInput.nextLine();
		}
		while (!response.equalsIgnoreCase("no"));
		
		
	}

}