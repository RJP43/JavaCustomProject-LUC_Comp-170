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
		
		//Declare variables for parts of citations
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
		String articleTitle;
		String websiteTitle;
		String websitePublisher;
		String webPublishDate;
		String webAccessDate;
		String url;
		int yearBookPublished;
		String output;
		String htmlOutput;
		
		MyCitations citeHolder = new MyCitations();
	
		System.out.println("Cite Before You Write!");
		System.out.println("This program takes your inputs and compiles them into a bibliography in the form of an HTML file.");
		System.out.println("Follow program instructions: ");
			
		//Do while loop to keep program running until user specifies to stop
		do {
		// Ask user what kind of source they're citing
		System.out.println("What kind of source are you citing? (Book or website) ");
		sourceType = userInput.nextLine();
		// Two source types for testing for now
		
		if (sourceType.equalsIgnoreCase("book")){
			// Ask for author first name
			System.out.println("Enter the author's first name: ");
			authorFName = userInput.nextLine();
		
			// Ask for last name
			System.out.println("Enter the author's last name: ");
			authorLName = userInput.nextLine();
			
			// Ask for title
			System.out.println("Enter the title of your source: ");
			title = userInput.nextLine();
			
			// Ask for publisher
			System.out.println("Enter the publisher of your source: ");
			publisher = userInput.nextLine();
			
			// Ask for city of publication
			System.out.println("Enter the city the book was published in: ");
			city = userInput.nextLine();
			
			// Ask for date published
			System.out.println("Enter the year the book was published: ");
			yearBookPublished = userInput.nextInt();
			
			//blank input to avoid skipped line bug
			userInput.nextLine();
			
			//Print book citation by calling citation method
			Citation bookCitation;
			bookCitation = new Citation(title, authorFName, authorLName, publisher, yearBookPublished, city);
			output = bookCitation.bookToString();
			System.out.println(output);
			
			//Add italicizing html tags
			bookCitation.htmlBookItalicize();
			
			//Add citation to MyCitations
			htmlOutput = bookCitation.bookToString();
			citeHolder.addCitation(htmlOutput);
			
			//Increase count of book citations
			citeHolder.increaseBookCount();
		}
		else if ((sourceType.equalsIgnoreCase("website"))){
			//Ask for article title 
			System.out.println("Enter the title of the article: ");
			articleTitle = userInput.nextLine();

			//Ask for website title
			System.out.println("Enter the title of the website: ");
			websiteTitle = userInput.nextLine();

			//Ask for website URL
			System.out.println("Enter the URL of the website: ");
			url = userInput.nextLine();
			
			//Ask for website access date
			System.out.println("When did you access this site? ");
			webAccessDate = userInput.nextLine();

			//Ask for website publisher
			System.out.println("Who is the publisher of the website, if available?");
			websitePublisher = userInput.nextLine();

			//Ask for website publish date
			System.out.println("Enter the publish date of the website, if available.");
			webPublishDate = userInput.nextLine();

			//blank input to avoid skipped line bug
			userInput.nextLine();

			//Print citation using website citation method from citation class
			Citation websiteCitation;
			websiteCitation = new Citation(articleTitle, websiteTitle, websitePublisher, webPublishDate, webAccessDate, url);
			
			//mutator methods
			websiteCitation.noWebPublisher();
			websiteCitation.noWebDate();
			
			output = websiteCitation.webToString();
			System.out.println(output);
			
			//Add html tags
			websiteCitation.htmlWebItalicize();
			websiteCitation.htmlWebQuotes();
			websiteCitation.htmlUrl();
			
			//Add citation to MyCitations
			htmlOutput = websiteCitation.webToString();
			citeHolder.addCitation(htmlOutput);
			
			//Increase count of book citations
			citeHolder.increaseWebsiteCount();
			
		}
		
		//Ask user if they'd like to run the program again
		System.out.println("Would you like to run the program again? ");
		response = userInput.nextLine();
		}
		while (!response.equalsIgnoreCase("no"));
		
		System.out.println("You created " + citeHolder.getBookCount() + " book citations.");
		System.out.println("You created " + citeHolder.getWebsiteCount() + " website citations.");
		System.out.println(citeHolder.createFile());
		
	}

}