
public class Book {
	private String bname;
	private Author author;
	private int pages;
	private int cost;
	private int bnumber;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bname, Author author, int pages, int cost, int bnumber) {
		super();
		this.bname = bname;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
		this.bnumber = bnumber;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	@Override
	public String toString() {
		return "Book [bname=" + bname + ", author=" + author + ", pages=" + pages + ", cost=" + cost + ", bnumber="
				+ bnumber + "]";
	}
	
	

}
