
public class Citation {
	
//book instance variables		
	private String authorFName;
	private String authorLName;
	private String bookTitle;
	private String bookPublisher;
	private int bookPublishYear;
	private String bookCity;
	
//website article instance variables	
	private String articleTitle;
	private String website;
	private String webPublisher;
	private String webPublishDate;
	private String accessDate;
	private String url;
	
	
//book constructor	
	public Citation(String bookname, String authfname, String authlname, String publishername, int year, String city){
		
		bookTitle = bookname;
		authorFName = authfname;
		authorLName = authlname;
		bookPublisher = publishername;
		bookPublishYear = year;
		bookCity = city;
		
	}

//website article constructor
	public Citation(String title, String authfname, String authlname, String websitename, String publisher, String publishdate, String accesseddate, String url){
		
		articleTitle = title;
		website = websitename;
		webPublisher = publisher;
		webPublishDate = publishdate;
		accessDate = accesseddate;
		this.url = url;
		
	}
	
//italicize	booktitle
	public String htmlBookItalicize(){
		bookTitle = "<em>" + bookTitle + "</em>";
		return bookTitle;
	}
	
//italicize	website publisher
	public void htmlWebItalicize(){
		website = "<em>" + website + ".</em>";
	}	
	
//add quotes
	public void htmlWebQuotes(){
		articleTitle = "<&ldquo>" + articleTitle + "<&rdquo>";
	}	
	
//format for html hyperlink
	public void htmlUrl(){
		url = "<ahref=\"URL\">" + url + "</a>";
	}	

//if no publisher
	public void noWebPublisher(){
		if (website.equals("")){
			website = "n.p.";
		}
	}
	
//if no date
	public void noWebDate(){
		if (webPublishDate.equals("")){
			webPublishDate = "n.d.";
		}
	}
	
//print out a book citation
	public String bookToString(){
		
		String toString;
		
		toString = authorLName + ", " + authorFName + ". " + bookTitle + ". " + bookCity + ": " + bookPublisher + ", " + bookPublishYear + ". Print.";
				
		return toString;
	}
	
	
//print out an web citation
	public String webToString(){
		
		String toString;
		
		toString = articleTitle + " " + website + ". " + webPublisher + ", " + webPublishDate + ". Web. " + accessDate + ". \r" + url;
		
	return toString;
}
}