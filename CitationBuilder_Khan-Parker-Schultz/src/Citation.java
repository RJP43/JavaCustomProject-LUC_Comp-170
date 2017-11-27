
public class Citation {
	
	private String authorFName;
	private String authorLName;
	private String author2FName;
	private String author2LName;
	private String bookTitle;
	private String articleTitle;
	private String publisher;
	private String website;
	private String webPublishDate;
	private String url;
	private int bookPublishYear;
	private int pageNumber;
	
	
//book constructor	
	public Citation(String bookname, String authfname, String authlname, String publishername, int year, int page){
		
		bookTitle = bookname;
		authorFName = authfname;
		authorLName = authlname;
		publisher = publishername;
		bookPublishYear = year;
		pageNumber = page;
		
	}
	
//book with two authors constructor (if we want)
	public Citation(String bookname, String authfname1, String authlname1, String authfname2, String authlname2, String publishername, int year, int page){
		
		bookTitle = bookname;
		authorFName = authfname1;
		authorLName = authlname1;
		author2FName = authfname2;
		author2LName = authlname2;
		publisher = publishername;
		bookPublishYear = year;
		pageNumber = page;
		
	}

//website article constructor
	public Citation(String articlename, String authfname, String authlname, String websitename, String publishdate, String url){
		
		articleTitle = articlename;
		authorFName = authfname;
		authorLName = authlname;
		website = websitename;
		webPublishDate = publishdate;
		this.url = url;
		
	}

//make sure dates are entered correctly??
	public boolean validDateReader(){
		
		return true;
	}
	
//italicize	
	public String htmlItalicize(String word){
		
		return word;
	}
	
//add quotes
	public String addQuotes(String word){
		
		return word;
	}

	
//print out a book citation
	public String bookToString(String bookname, String authorfname, String authorlname, String publishername, int year, int page){

		Citation MLABook = new Citation(bookname, authorfname, authorlname, publishername, year, page);
				
		return "toString";
	}
	
//print out an article citation
	public String articleToString(String articlename, String authorfname, String authorlname,  String websitename, String publishdate, String url){

		Citation MLAArticle = new Citation(articlename, authorfname, authorlname, websitename, publishdate, url);
		
	return "toString";
}
}