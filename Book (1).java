public 	class Book{
	protected String title = null;
	protected long ISBN = 0;
	protected String author = null;
	public Book(String title,long ISBN,String author)
	{
		this.title = title;
		this.ISBN = ISBN;
		this.author = author;
	}
	public void display()
	{
		System.out.println("Title: "+this.title);
		System.out.println("ISBN: "+this.ISBN);
		System.out.println("Author: "+this.author);
	}
}
