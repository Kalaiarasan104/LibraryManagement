package com.libraryManagementSystem;

import java.util.Scanner;

public class Librarian {
	Scanner sc1 = new Scanner(System.in);
	private String password = "1234";
	static Book[] history = new Book[100];
	static Book[] literature = new Book[100];
	static Book[] article = new Book[100];
	static Book[] sports = new Book[100];
	static Book[] competative = new Book[100];
	static Book[] stories = new Book[100];
	static DailiesAndMagazines[] dailiesAndMagazines = new DailiesAndMagazines[50];
	// Borrower[] borrowers = new Borrower[4];
	// Borrower b1 =new Borrower();
	// Donor[] donors=new Donor[borrowers.length];
	static Library lib = new Library();
	static Account[] accounts = new Account[100];
	Account b1 = new Account();
	// List<Book> borrowedHistory =new ArrayList<>();
	// public Object books;

	public String getPassword() {
		return password;
	}
//	public void setLibrarianName(String librarianName) {
//		LibrarianName = librarianName;
//	}

	public void addHistoryBook(Book book) {
//		if (isHistoryBookPresent(book)) {
		boolean flag = true;
		for (int i = 0; i < history.length; i++) {
			if (history[i] == null) {
				history[i] = book;
				flag = false;
				System.out.println(book.getBname() + "\n new Book is added to History Section ");
				break;
			} else if (history[i].getBid() == book.getBid()) {
				if (history[i].getBname().equalsIgnoreCase(book.getBname())) {
					history[i].setBookCount(history[i].getBookCount() + book.getBookCount());
					System.out.println("\n this book is added to the existing book...");
					System.out.println(history[i].toString());
					flag = false;
					break;
				} else {
					try {
						throw new InvalidBookException();
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
						System.out.println("select any one option \n" + "1) add book\n");
						String x = sc1.next();
						switch (x) {
						case "1":
							lib.addBook();
							break;
						default:
							break;
						}

					}
				}
			}
		}
		if (flag) {
			System.out.println("Library is full....");
		}
//		}
	}

	public void addLiteratureBook(Book book) {
		boolean flag = true;
		for (int i = 0; i < literature.length; i++) {
			if (literature[i] == null) {
				literature[i] = book;
				flag = false;
				System.out.println(book.getBname() + "\n new Book is added to History Section ");
				break;
			} else if (literature[i].getBid() == book.getBid()) {
				if (literature[i].getBname().equalsIgnoreCase(book.getBname())) {
					literature[i].setBookCount(literature[i].getBookCount() + book.getBookCount());
					System.out.println("\n this book is added to the existing book...");
					System.out.println(literature[i].toString());
					flag = false;
					break;
				} else {
					try {
						throw new InvalidBookException();
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
						System.out.println("select any one option \n" + "1) add book\n");
						String x = sc1.next();
						switch (x) {
						case "1":
							lib.addBook();
							break;
						default:
							break;
						}

					}
				}
			}
		}
		if (flag) {
			System.out.println("Library is full....");
		}
	}
//	public Boolean isLiteratureBookPresent(Book book) {
//		boolean flag=true;
//		 for (int i = 0; i < literature.length; i++) {
//			if (literature[i]!=null) {
//				if (literature[i].getBid()==book.getBid()) {
//					//literature[i].setBookCount(literature[i].getBookCount()+book.getBookCount());
//	literature[i].setBookCount(literature[i].getBookCount()+book.getBookCount());
//	System.out.println("Your book is added to the existing book...");
//	System.out.println(literature[i].toString());
//	flag= false;
//	break;
////				}
//			}
//		}
//		if (flag) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public void addStoryBook(Book book) {
		boolean flag = true;

		for (int i = 0; i < stories.length; i++) {
			if (stories[i] == null) {
				stories[i] = book;
				flag = false;
				System.out.println(book.getBname() + "\n new Book is added to History Section ");
				break;
			} else if (stories[i].getBid() == book.getBid()) {
				if (stories[i].getBname().equalsIgnoreCase(book.getBname())) {
					stories[i].setBookCount(stories[i].getBookCount() + book.getBookCount());
					System.out.println("\n this book is added to the existing book...");
					System.out.println(stories[i].toString());
					flag = false;
					break;
				} else {
					try {
						throw new InvalidBookException();
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
						System.out.println("select any one option \n" + "1) add book\n");
						String x = sc1.next();
						switch (x) {
						case "1":
							lib.addBook();
							break;
						default:
							break;
						}

					}
				}
			}
		}
		if (flag) {
			System.out.println("Library is full....");
		}
	}
//	public Boolean isStoryBookPresent(Book book) {
//		boolean flag=true;
//		 for (int i = 0; i < stories.length; i++) {
//			if (stories[i]!=null) {
//				if (stories[i].getBid()==book.getBid()) {
//					stories[i].setBookCount(stories[i].getBookCount()+book.getBookCount());
//					System.out.println("Your book is added to the existing book...");
//					System.out.println(stories[i].toString());
//					flag= false;
//					break;
//				}
//			}
//		}
//		if (flag) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public void addSportsBook(Book book) {
		boolean flag = true;
		for (int i = 0; i < sports.length; i++) {
			if (sports[i] == null) {
				sports[i] = book;
				flag = false;
				System.out.println(book.getBname() + "\n new Book is added to History Section ");
				break;
			} else if (sports[i].getBid() == book.getBid()) {
				if (sports[i].getBname().equalsIgnoreCase(book.getBname())) {
					sports[i].setBookCount(sports[i].getBookCount() + book.getBookCount());
					System.out.println("\n this book is added to the existing book...");
					System.out.println(sports[i].toString());
					flag = false;
					break;
				} else {
					try {
						throw new InvalidBookException();
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
						System.out.println("select any one option \n" + "1) add book\n");
						String x = sc1.next();
						switch (x) {
						case "1":
							lib.addBook();
							break;
						default:
							break;
						}
					}
				}
			}
		}
		if (flag) {
			System.out.println("Library is full....");
		}
	}
//	public Boolean isSportsBookPresent(Book book) {
//		boolean flag=true;
//		 for (int i = 0; i < sports.length; i++) {
//			if (sports[i]!=null) {
//				if (sports[i].getBid()==book.getBid()) {
//					sports[i].setBookCount(sports[i].getBookCount()+book.getBookCount());
//					System.out.println("Your book is added to the existing book...");
//					System.out.println(sports[i].toString());
//					flag= false;
//					break;
//				}
//			}
//		}
//		if (flag) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public void addArticleBook(Book book) {
		boolean flag = true;

		for (int i = 0; i < article.length; i++) {
			if (article[i] == null) {
				article[i] = book;
				flag = false;
				System.out.println(book.getBname() + "\n new Book is added to History Section ");
				break;
			} else if (article[i].getBid() == book.getBid()) {
				if (article[i].getBname().equalsIgnoreCase(book.getBname())) {
					article[i].setBookCount(article[i].getBookCount() + book.getBookCount());
					System.out.println("\n this book is added to the existing book...");
					System.out.println(article[i].toString());
					flag = false;
					break;
				} else {
					try {
						throw new InvalidBookException();
					} catch ( Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
						System.out.println("select any one option \n" + "1) add book\n");
						String x = sc1.next();
						switch (x) {
						case "1":
							lib.addBook();
							break;
						default:
							break;
						}

					}
				}
			}
		}
		if (flag) {
			System.out.println("Library is full....");
		}
	}
//	public Boolean isArticleBookPresent(Book book) {
//		boolean flag=true;
//		 for (int i = 0; i < article.length; i++) {
//			if (article[i]!=null) {
//				if (article[i].getBid()==book.getBid()) {
//					article[i].setBookCount(article[i].getBookCount()+book.getBookCount());
//					System.out.println("Your book is added to the existing book...");
//					System.out.println(article[i].toString());
//					flag= false;
//					break;
//				}
//			}
//		}
//		if (flag) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public void addCompetativeBook(Book book) {
		boolean flag = true;
		for (int i = 0; i < competative.length; i++) {
			if (competative[i] == null) {
				competative[i] = book;
				flag = false;
				System.out.println(book.getBname() + "\n new Book is added to History Section ");
				break;
			} else if (competative[i].getBid() == book.getBid()) {
				if (competative[i].getBname().equalsIgnoreCase(book.getBname())) {
					competative[i].setBookCount(competative[i].getBookCount() + book.getBookCount());
					System.out.println("\n this book is added to the existing book...");
					System.out.println(competative[i].toString());
					flag = false;
					break;
				} else {
					try {
						throw new InvalidBookException();
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
						System.out.println("select any one option \n" + "1) add book\n");
						String x = sc1.next();
						switch (x) {
						case "1":
							lib.addBook();
							break;
						default:
							break;
						}

					}
				}
			}
		}
		if (flag) {
			System.out.println("Library is full....");
		}
	}
//	public Boolean isCompetativeBookPresent(Book book) {
//		boolean flag=true;
//		 for (int i = 0; i < competative.length; i++) {
//			if (competative[i]!=null) {
//				if (competative[i].getBid()==book.getBid()) {
//					competative[i].setBookCount(history[i].getBookCount()+book.getBookCount());
//					System.out.println("Your book is added to the existing book...");
//					System.out.println(competative[i].toString());
//					flag= false;
//					break;
//				}
//			}
//		}
//		if (flag) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public boolean removeHistoryBook(int bid) {
		for (int i = 0; i < history.length; i++) {
			if (history[i] != null) {
				if (bid == history[i].getBid()) {
					System.out.println(history[i].toString() + " \n is deleted from the library");
					if (history[i].getBookCount() > 0) {
						history[i].setBookCount(history[i].getBookCount() - 1);
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean removeLiteratureBook(int bid) {
		for (int i = 0; i < literature.length; i++) {
			if (literature[i] != null) {
				if (bid == literature[i].getBid()) {
					System.out.println(literature[i].toString() + " \n is deleted from the library");
					literature[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public boolean removeArticleBook(int bid) {
		for (int i = 0; i < article.length; i++) {
			if (article[i] != null) {
				if (bid == article[i].getBid()) {
					System.out.println(article[i].toString() + " \n is deleted from the library");
					article[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public boolean removeSportsBook(int bid) {
		for (int i = 0; i < sports.length; i++) {
			if (sports[i] != null) {
				if (bid == sports[i].getBid()) {
					System.out.println(sports[i].toString() + " \n is deleted from the library");
					sports[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public boolean removeStoryBook(int bid) {
		for (int i = 0; i < stories.length; i++) {
			if (stories[i] != null) {
				if (bid == stories[i].getBid()) {
					System.out.println(stories[i].toString() + " \n is deleted from the library");
					stories[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public boolean removeCompetativeBook(int bid) {
		for (int i = 0; i < competative.length; i++) {
			if (competative[i] != null) {
				if (bid == competative[i].getBid()) {
					System.out.println(competative[i].toString() + " \n is deleted from the library");
					competative[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public void addAccount(Account account) {
		boolean flag = true;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				flag = false;
				System.out.println(accounts[i].toString() + "\n this person is added to Library");
				break;
			}
		}
		if (flag) {
			System.out.println("Account limit for this borrower is full....");
		}
	}

	public boolean removeAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accountId == accounts[i].getAId()) {
					if (accounts[i].getBorrowedBookCount() > 0) {
						System.out.println("Return the borrowed books before closing the account");
					} else {
						System.out.println(accounts[i].toString() + "\n is deleted from the library");
						accounts[i] = null;
						return true;
					}
				}
			}
		}
		return false;
	}

	public void displayBooks() {
		System.out.println("History books....\n");
		for (int i = 0; i < history.length; i++) {
			if (history[i] != null) {
				System.out.println((i + 1) + ". " + history[i].toString());
			}
		}
		System.out.println("Literature books....\n");
		for (int i = 0; i < literature.length; i++) {
			if (literature[i] != null) {
				System.out.println((i + 1) + ". " + literature[i].toString());
			}
		}
		System.out.println("Stories books....\n");
		for (int i = 0; i < stories.length; i++) {
			if (stories[i] != null) {
				System.out.println((i + 1) + ". " + stories[i].toString());
			}
		}
		System.out.println("Competative books....\n");
		for (int i = 0; i < competative.length; i++) {
			if (competative[i] != null) {
				System.out.println((i + 1) + ". " + competative[i].toString());
			}
		}
		System.out.println("Articles books....\n");
		for (int i = 0; i < article.length; i++) {
			if (article[i] != null) {
				System.out.println((i + 1) + ". " + article[i].toString());
			}
		}
		System.out.println("Sports books....\n");
		for (int i = 0; i < sports.length; i++) {
			if (sports[i] != null) {
				System.out.println((i + 1) + ". " + sports[i].toString());
			}
		}
	}

	public void displayAccount() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println((i + 1) + ". " + accounts[i].toString());
			}
		}
	}

	public Date addDate() {
		try {
			System.out.println("dd= ");
			int dd = sc1.nextInt();
			sc1.nextLine();
			System.out.println("mm= ");
			int mm = sc1.nextInt();
			sc1.nextLine();
			System.out.println("yyyy= ");
			int yyyy = sc1.nextInt();
			sc1.nextLine();

			Date k = new Date(dd, mm, yyyy);
			if (!k.isValidDate(dd, mm, yyyy)) {
				try {
					throw new InvalidDateInLibraryException();
				} catch (InvalidDateInLibraryException e) {
					System.err.println(e.getMessage());
					addDate();
				}
			} else {
				return k;
			}
//			if (k.isValidDate(dd, mm, yyyy)) {
//				return k;
//			} else {
//				System.out.println("enter a valid date....");
//				k=null;
//				return addDate();
//			}
		} catch (Exception e) {
			System.out.println("invalid input");
			System.out.println("1) to re-enter date\n 2) exit to main menu");
			int k = sc1.nextInt();
			sc1.nextLine();
			switch (k) {
			case 1:
				addDate();
				break;
			case 2:
				break;
			}
		}
		return null;
	}

	public void borrowHistoryBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					if (accounts[i].getBorrowedBookCount() < 6) {
						flag2 = true;
						for (int j = 0; j < history.length; j++) {
							if (history[j] != null) {
								if (bookId == history[j].getBid()) {
									accounts[i].setBorrowedBooks(history[j]);
									history[j].setBookCount(history[j].getBookCount() - 1);
									System.out.println("enter borrowing date...");
									Date borrowDate = addDate();
									System.out.println("enter returning date.....");
									Date returnDate = addDate();
									history[j].setBorrowDate(borrowDate);
									history[j].setReturnDate(returnDate);
									System.out.println(accounts[i].getAName() + " has taken a book "
											+ history[j].getBname() + " from our library");
									int x = accounts[i].getBorrowedBookCount() + 1;
									accounts[i].setBorrowedBookCount(x);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("This account not yet registered...");
			return;
		}
		if (!flag2) {
			System.out.println("you already borrowed enough books...\nBoorowing limit has been reached...");
		}
	}

	public void borrowLiteratureBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					if (accounts[i].getBorrowedBookCount() < 6) {
						flag2 = true;
						for (int j = 0; j < literature.length; j++) {
							if (literature[j] != null) {
								if (bookId == literature[j].getBid()) {
									accounts[i].setBorrowedBooks(literature[j]);
									literature[j].setBookCount(literature[j].getBookCount() - 1);
									System.out.println("enter borrowing date...");
									Date borrowDate = addDate();
									System.out.println("enter returning date.....");
									Date returnDate = addDate();
									literature[j].setBorrowDate(borrowDate);
									literature[j].setReturnDate(returnDate);
									System.out.println(accounts[i].getAName() + " has taken a book "
											+ literature[j].getBname() + " from our library");
									int x = accounts[i].getBorrowedBookCount() + 1;
									accounts[i].setBorrowedBookCount(x);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("This account not yet registered...");
		}
		if (!flag2) {
			System.out.println("you already borrowed enough books...\nBoorowing limit has been reached...");
		}

	}

	public void borrowStoryBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					if (accounts[i].getBorrowedBookCount() < 6) {
						flag2 = true;
						for (int j = 0; j < stories.length; j++) {
							if (stories[j] != null) {
								if (bookId == stories[j].getBid()) {
									accounts[i].setBorrowedBooks(stories[j]);
									stories[j].setBookCount(stories[j].getBookCount() - 1);
									System.out.println("enter borrowing date...");
									Date borrowDate = addDate();
									System.out.println("enter returning date.....");
									Date returnDate = addDate();
									stories[j].setBorrowDate(borrowDate);
									stories[j].setReturnDate(returnDate);
									System.out.println(accounts[i].getAName() + " has taken a book "
											+ stories[j].getBname() + " from our library");
									int x = accounts[i].getBorrowedBookCount() + 1;
									accounts[i].setBorrowedBookCount(x);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("This account not yet registered...");
		}
		if (!flag2) {
			System.out.println("you already borrowed enough books...\nBoorowing limit has been reached...");
		}

	}

	public void borrowArticleBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					if (accounts[i].getBorrowedBookCount() < 6) {
						flag2 = true;
						for (int j = 0; j < article.length; j++) {
							if (article[j] != null) {
								if (bookId == article[j].getBid()) {
									accounts[i].setBorrowedBooks(article[j]);
									article[j].setBookCount(article[j].getBookCount() - 1);
									System.out.println("enter borrowing date...");
									Date borrowDate = addDate();
									System.out.println("enter returning date.....");
									Date returnDate = addDate();
									article[j].setBorrowDate(borrowDate);
									article[j].setReturnDate(returnDate);
									System.out.println(accounts[i].getAName() + " has taken a book "
											+ article[j].getBname() + " from our library");
									int x = accounts[i].getBorrowedBookCount() + 1;
									accounts[i].setBorrowedBookCount(x);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("This account not yet registered...");
		}
		if (!flag2) {
			System.out.println("you already borrowed enough books...\nBoorowing limit has been reached...");
		}

	}

	public void borrowCompetativeBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					if (accounts[i].getBorrowedBookCount() < 6) {
						flag2 = true;
						for (int j = 0; j < competative.length; j++) {
							if (competative[j] != null) {
								if (bookId == competative[j].getBid()) {
									accounts[i].setBorrowedBooks(competative[j]);
									competative[j].setBookCount(competative[j].getBookCount() - 1);
									System.out.println("enter borrowing date...");
									Date borrowDate = addDate();
									System.out.println("enter returning date.....");
									Date returnDate = addDate();
									competative[j].setBorrowDate(borrowDate);
									competative[j].setReturnDate(returnDate);
									System.out.println(accounts[i].getAName() + " has taken a book "
											+ competative[j].getBname() + " from our library");
									int x = accounts[i].getBorrowedBookCount() + 1;
									accounts[i].setBorrowedBookCount(x);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("This account not yet registered...");
		}
		if (!flag2) {
			System.out.println("you already borrowed enough books...\nBoorowing limit has been reached...");
		}

	}

	public void borrowSportsBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					if (accounts[i].getBorrowedBookCount() < 6) {
						flag2 = true;
						for (int j = 0; j < sports.length; j++) {
							if (sports[j] != null) {
								if (bookId == sports[j].getBid()) {
									accounts[i].setBorrowedBooks(sports[j]);
									sports[j].setBookCount(sports[j].getBookCount() - 1);
									System.out.println("enter borrowing date...");
									Date borrowDate = addDate();
									System.out.println("enter returning date.....");
									Date returnDate = addDate();
									sports[j].setBorrowDate(borrowDate);
									sports[j].setReturnDate(returnDate);
									System.out.println(accounts[i].getAName() + " has taken a book "
											+ sports[j].getBname() + " from our library");
									int x = accounts[i].getBorrowedBookCount() + 1;
									accounts[i].setBorrowedBookCount(x);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("This account not yet registered...");
		}
		if (!flag2) {
			System.out.println("you already borrowed enough books...\nBoorowing limit has been reached...");
		}

	}

	public void returnHistoryBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					for (int j = 0; j < history.length; j++) {
						if (history[j] != null) {
							if (bookId == history[j].getBid()) {
								flag2 = true;
								System.out.println(
										accounts[i].getAName() + " has returned a book " + history[j].getBname());
								// b1.setBorrowedBooks(null);
								accounts[i].setBorrowedBooks(null);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() + 1);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() - 1);
								history[j].setBorrowDate(null);
								history[j].setReturnDate(null);
								break;
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("Invalid Account Id : " + borrowerId);
		}
		if (!flag2) {
			System.out.println("Book not found with this ID : " + bookId);
		}
	}

	public void returnSportsBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					for (int j = 0; j < sports.length; j++) {
						if (sports[j] != null) {
							if (bookId == sports[j].getBid()) {
								flag2 = true;
								System.out.println(
										accounts[i].getAName() + " has returned a book " + sports[j].getBname());
								// b1.setBorrowedBooks(null);
								accounts[i].setBorrowedBooks(null);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() + 1);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() - 1);
								sports[j].setBorrowDate(null);
								sports[j].setReturnDate(null);
								break;
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("Invalid Account Id : " + borrowerId);
		}
		if (!flag2) {
			System.out.println("Book not found with this ID : " + bookId);
		}
	}

	public void returnLiteratureBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					for (int j = 0; j < literature.length; j++) {
						if (literature[j] != null) {
							if (bookId == literature[j].getBid()) {
								flag2 = true;
								System.out.println(
										accounts[i].getAName() + " has returned a book " + literature[j].getBname());
								// b1.setBorrowedBooks(null);
								accounts[i].setBorrowedBooks(null);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() + 1);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() - 1);
								literature[j].setBorrowDate(null);
								literature[j].setReturnDate(null);
								break;
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("Invalid Account Id : " + borrowerId);
		}
		if (!flag2) {
			System.out.println("Book not found with this ID : " + bookId);
		}
	}

	public void returnArticleBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					for (int j = 0; j < article.length; j++) {
						if (article[j] != null) {
							if (bookId == article[j].getBid()) {
								flag2 = true;
								System.out.println(
										accounts[i].getAName() + " has returned a book " + article[j].getBname());
								// b1.setBorrowedBooks(null);
								accounts[i].setBorrowedBooks(null);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() + 1);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() - 1);
								article[j].setBorrowDate(null);
								article[j].setReturnDate(null);
								break;
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("Invalid Account Id : " + borrowerId);
		}
		if (!flag2) {
			System.out.println("Book not found with this ID : " + bookId);
		}
	}

	public void returnCompetativeBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					for (int j = 0; j < competative.length; j++) {
						if (competative[j] != null) {
							if (bookId == competative[j].getBid()) {
								flag2 = true;
								System.out.println(
										accounts[i].getAName() + " has returned a book " + competative[j].getBname());
								// b1.setBorrowedBooks(null);
								accounts[i].setBorrowedBooks(null);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() + 1);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() - 1);
								competative[j].setBorrowDate(null);
								competative[j].setReturnDate(null);
								break;
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("Invalid Account Id : " + borrowerId);
		}
		if (!flag2) {
			System.out.println("Book not found with this ID : " + bookId);
		}
	}

	public void returnStoryBook(int bookId, int borrowerId) {
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (borrowerId == accounts[i].getAId()) {
					flag1 = true;
					for (int j = 0; j < stories.length; j++) {
						if (stories[j] != null) {
							if (bookId == stories[j].getBid()) {
								flag2 = true;
								System.out.println(
										accounts[i].getAName() + " has returned a book " + stories[j].getBname());
								// b1.setBorrowedBooks(null);
								accounts[i].setBorrowedBooks(null);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() + 1);
								accounts[i].setBorrowedBookCount(accounts[i].getBorrowedBookCount() - 1);
								stories[j].setBorrowDate(null);
								stories[j].setReturnDate(null);
								break;
							}
						}
					}
				}
			}
		}
		if (!flag1) {
			System.out.println("Invalid Account Id : " + borrowerId);
		}
		if (!flag2) {
			System.out.println("Book not found with this ID : " + bookId);
		}
	}

	public void searchBookById(int bookId) {
		System.out.println("History books....\n");
		for (int i = 0; i < history.length; i++) {
			if (history[i] != null) {
				if (history[i].getBid() == bookId) {
					System.out.println((i + 1) + ". " + history[i].toString());
				}
			}
		}
		System.out.println("Literature books....\n");
		for (int i = 0; i < literature.length; i++) {
			if (literature[i] != null) {
				if (literature[i].getBid() == bookId) {
					System.out.println((i + 1) + ". " + literature[i].toString());
				}
			}
		}
		System.out.println("Stories books....\n");
		for (int i = 0; i < stories.length; i++) {
			if (stories[i] != null) {
				if (stories[i].getBid() == bookId) {
					System.out.println((i + 1) + ". " + stories[i].toString());
				}
			}
		}
		System.out.println("Competative books....\n");
		for (int i = 0; i < competative.length; i++) {
			if (competative[i] != null) {
				if (competative[i].getBid() == bookId) {
					System.out.println((i + 1) + ". " + competative[i].toString());
				}
			}
		}
		System.out.println("Articles books....\n");
		for (int i = 0; i < article.length; i++) {
			if (article[i] != null) {
				if (article[i].getBid() == bookId) {
					System.out.println((i + 1) + ". " + article[i].toString());
				}
			}
		}
		System.out.println("Sports books....\n");
		for (int i = 0; i < sports.length; i++) {
			if (sports[i] != null) {
				if (sports[i].getBid() == bookId) {
					System.out.println((i + 1) + ". " + sports[i].toString());
				}
			}
		}
	}

	public void searchBookByName(String bookName) {
		System.out.println("History books....\n");
		for (int i = 0; i < history.length; i++) {
			if (history[i] != null) {
				if (history[i].getBname().equalsIgnoreCase(bookName)) {
					System.out.println((i + 1) + ". " + history[i].toString());
				}
			}
		}
		System.out.println("Literature books....\n");
		for (int i = 0; i < literature.length; i++) {
			if (literature[i] != null) {
				if (literature[i].getBname().equalsIgnoreCase(bookName)) {
					System.out.println((i + 1) + ". " + literature[i].toString());
				}
			}
		}
		System.out.println("Stories books....\n");
		for (int i = 0; i < stories.length; i++) {
			if (stories[i] != null) {
				if (stories[i].getBname().equalsIgnoreCase(bookName)) {
					System.out.println((i + 1) + ". " + stories[i].toString());
				}
			}
		}
		System.out.println("Competative books....\n");
		for (int i = 0; i < competative.length; i++) {
			if (competative[i] != null) {
				if (competative[i].getBname().equalsIgnoreCase(bookName)) {
					System.out.println((i + 1) + ". " + competative[i].toString());
				}
			}
		}
		System.out.println("Articles books....\n");
		for (int i = 0; i < article.length; i++) {
			if (article[i] != null) {
				if (article[i].getBname().equalsIgnoreCase(bookName)) {
					System.out.println((i + 1) + ". " + article[i].toString());
				}
			}
		}
		System.out.println("Sports books....\n");
		for (int i = 0; i < sports.length; i++) {
			if (sports[i] != null) {
				if (sports[i].getBname().equalsIgnoreCase(bookName)) {
					System.out.println((i + 1) + ". " + sports[i].toString());
				}
			}
		}
	}

	public void searchBookByAuthor(String author) {
		System.out.println("History books....\n");
		for (int i = 0; i < history.length; i++) {
			if (history[i] != null) {
				if (history[i].getAuthor().equalsIgnoreCase(author)) {
					System.out.println((i + 1) + ". " + history[i].toString());
				}
			}
		}
		System.out.println("Literature books....\n");
		for (int i = 0; i < literature.length; i++) {
			if (literature[i] != null) {
				if (literature[i].getAuthor().equalsIgnoreCase(author)) {
					System.out.println((i + 1) + ". " + literature[i].toString());
				}
			}
		}
		System.out.println("Stories books....\n");
		for (int i = 0; i < stories.length; i++) {
			if (stories[i] != null) {
				if (stories[i].getAuthor().equalsIgnoreCase(author)) {
					System.out.println((i + 1) + ". " + stories[i].toString());
				}
			}
		}
		System.out.println("Competative books....\n");
		for (int i = 0; i < competative.length; i++) {
			if (competative[i] != null) {
				if (competative[i].getAuthor().equalsIgnoreCase(author)) {
					System.out.println((i + 1) + ". " + competative[i].toString());
				}
			}
		}
		System.out.println("Articles books....\n");
		for (int i = 0; i < article.length; i++) {
			if (article[i] != null) {
				if (article[i].getAuthor().equalsIgnoreCase(author)) {
					System.out.println((i + 1) + ". " + article[i].toString());
				}
			}
		}
		System.out.println("Sports books....\n");
		for (int i = 0; i < sports.length; i++) {
			if (sports[i] != null) {
				if (sports[i].getAuthor().equalsIgnoreCase(author)) {
					System.out.println((i + 1) + ". " + sports[i].toString());
				}
			}
		}
	}

	public void searchAccountById(int accId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAId() == accId) {
					System.out.println(accounts[i].toString());
					break;
				}
			}
		}
	}

	public void searchAccountByName(String accName) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAName().equalsIgnoreCase(accName)) {
					System.out.println(accounts[i].toString());
				}
			}
		}
	}

	public void donateBook(int accountId, Book book) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAId() == accountId) {

				}
			}
		}
	}
}
