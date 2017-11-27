
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
	private String bookPublishYear;
	private int pageNumber;
	
	public Citation(String bookname, String authfname, String authlname, String publishername, String year, int page){
		
		bookTitle = bookname;
		authorFName = authfname;
		authorLName = authlname;
		publisher = publishername;
		bookPublishYear = year;
		pageNumber = page;
		
	}
	
	public Citation(String bookname, String authfname1, String authlname1, String authfname2, String authlname2, String publishername, String year, int page){
		
		bookTitle = bookname;
		authorFName = authfname1;
		authorLName = authlname1;
		author2FName = authfname2;
		author2LName = authlname2;
		publisher = publishername;
		bookPublishYear = year;
		pageNumber = page;
		
	}
	
	public Citation(String articlename, String authfname, String authlname, String websitename, String publishdate, String url){
		
		articleTitle = articlename;
		authorFName = authfname;
		authorLName = authlname;
		website = websitename;
		webPublishDate = publishdate;
		this.url = url;
		
	}
	
	public boolean validDateReader(){
		
		return true;
	}

	public String toString(){

		return "toString";
	}
	
}

