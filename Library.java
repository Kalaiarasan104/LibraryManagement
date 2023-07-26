package com.libraryManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
	Scanner sc1 = new Scanner(System.in);

	static Librarian libn = new Librarian();
	static Library lib = new Library();
	// static Donor don=new Donor();

	static int libraryCapacityOnBook = 600;;
	static int libraryCapicityOnAccount = Librarian.accounts.length;
	static int bookCount = 17;
	static int accountCount = 8;
	// static int donorCount=0;

	public static void main(String[] args) {
//		Scanner sc2 = new Scanner(System.in);
//		Librarian libn1 = new Librarian();

		lib.currentBooks();
		lib.currentAccounts();
//		System.out.println("enter the password to login");
//		String password = sc2.nextLine();
//		if (password.equals(libn1.getPassword())) {
//			lib.selectOption();
//		} else {
//			System.out.println("invalid password");
//		}
		lib.selectOption();
	}
	
	public void selectOption() {
		Library lib = new Library();
		try {

			boolean flag=true;
			while (flag) {
				System.out.println(" 1) enter 1 to add new book to the library"
						+ "\n 2) enter 2 to delete book to the library"
						+ "\n 3) enter 3 to add new account to the library"
						+ "\n 4) enter 4 to remove account to the library"
						+ "\n 5) enter 5 to display all the books in the library"
						+ "\n 6) enter 6 to to display all the accounts of the library"
						+ "\n 7) enter 7 to borrow book from the library" 
						+ "\n 8) enter 8 to return borrowed book"
						+ "\n 9) enter 9 to search book" 
						+ "\n 10) enter 10 to search account"
						+ "\n 11) enter 11 to display the donors of the library"
						+ "\n 12) enter 12 to exit the library");
				int x = sc1.nextInt();
				switch (x) {
				case 1:
					lib.addBook();
					break;
				case 2:
					lib.removeBook();
					break;
				case 3:
					lib.addAccount();
					break;
				case 4:
					lib.removeAccount();
					break;
				case 5:
					lib.displayBooks();
					break;
				case 6:
					lib.displayAccounts();
					break;
				case 7:
					lib.borrowBook();
					break;
				case 8:
					lib.returnBook();
					break;
				case 9:
					lib.searchBook();
					break;
				case 10:
					lib.searchAccount();
					break;
				case 11:
					break;
				case 12:
					flag = false;
					System.out.println("You have been logged out");
					break;
				default:
					System.out.println("invalid choice");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input....\n please enter the proper input");
			lib.selectOption();
		}
	}

	private void currentBooks() {
		Librarian.history[0] = new Book(10, "World war 1", "Allen", 300, 6, null, null);
		Librarian.history[1] = new Book(12, "World war 2", "Belly", 300, 6, null, null);
		Librarian.history[3] = new Book(13, "History of Independence", "Ramanujam", 300, 6, null, null);
		Librarian.history[4] = new Book(14, "Chola's Kingdom", "Elango", 900, 7, null, null);
		Librarian.literature[0] = new Book(10, "Silapathigaram", "Elangovadigal", 300, 6, null, null);
		Librarian.literature[1] = new Book(12, "Shades of you", "Rudyard Kippling", 300, 6, null, null);
		Librarian.literature[2] = new Book(13, "Ciesless Crusoder", "William Shakespear", 300, 6, null, null);
		Librarian.stories[0] = new Book(10, "Anna's Tales", "Anna", 300, 6, null, null);
		Librarian.stories[1] = new Book(12, "Bird's of prey", "Harly", 300, 6, null, null);
		Librarian.article[2] = new Book(10, "two sides of the coin", "Hendry Michel", 300, 6, null, null);
		Librarian.article[3] = new Book(12, "Article Red!", "Modona Elle", 300, 6, null, null);
		Librarian.sports[0] = new Book(10, "Cricket World", "Allen", 300, 6, null, null);
		Librarian.sports[1] = new Book(12, "India and Hockey", "Allen", 300, 6, null, null);
		Librarian.sports[2] = new Book(13, "Struggles of Sports Women", "Mariam", 300, 6, null, null);
		Librarian.competative[0] = new Book(10, "TNPSC", "Jumbulingam", 300, 6, null, null);
		Librarian.competative[1] = new Book(12, "UPSC", "Lingam", 300, 6, null, null);
		Librarian.competative[2] = new Book(13, "RRB", "Sombulingam", 300, 6, null, null);
		Librarian.dailiesAndMagazines[0] = new DailiesAndMagazines(1, 10, "The Hindu", "daily", 10);
		Librarian.dailiesAndMagazines[1] = new DailiesAndMagazines(2, 10, "Kumutham", "weekly", 10);
		Librarian.dailiesAndMagazines[2] = new DailiesAndMagazines(3, 10, "Anandha Vigudan", "monthly", 10);
		Librarian.dailiesAndMagazines[3] = new DailiesAndMagazines(4, 10, "Indian Express", "daily", 10);
		Librarian.dailiesAndMagazines[4] = new DailiesAndMagazines(5, 10, "To the Core", "monthly", 10);
//		Librarian.history[0]= new Book(31, "World war 1","Allen", 300, 6, null, null);
//		Librarian.history[0]= new Book(32, "World war 1","Allen", 300, 6, null, null);
//		Librarian.history[0]= new Book(33, "World war 1","Allen", 300, 6, null, null);

	}

	private void currentAccounts() {
		Librarian.accounts[0] = new Account(1, "Tony", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[1] = new Account(2, "Allen", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[2] = new Account(3, "Jack", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[3] = new Account(4, "Roges", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[4] = new Account(5, "Borten", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[5] = new Account(6, "Gibbs", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[6] = new Account(7, "Natasha", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[7] = new Account(8, "Wanda", new Book[5], 0, 0, new Book[100]);
		Librarian.accounts[8] = new Account(9, "Thor", new Book[5], 0, 0, new Book[100]);

	}

	private void displayAccounts() {

		libn.displayAccount();

		selectOption();
	}

	public void addBook() {
		try {
			if (bookCount < libraryCapacityOnBook) {
				System.out.println("enter the book id");
				int id = sc1.nextInt();
				sc1.nextLine();
				System.out.println("enter the name of the book");
				String name = sc1.nextLine();
				System.out.println("enter name of the author");
				String author = sc1.nextLine();
				System.out.println("enter the book price");
				int price = sc1.nextInt();
				sc1.nextLine();
				System.out.println("Enter the book count...");
				int bookCount = sc1.nextInt();
				sc1.nextLine();
				System.out.println(" Select the options \n " 
						+ "1) History\n "
						+ "2) Stories\n " 
						+ "3) Literature\n "
						+ "4) Articles\n " 
						+ "5) Competative\n " 
						+ "6) Sports\n " 
						+ "7) Dailies or Magazines\n "
						+ "8) back to main menu");
				int bookType = sc1.nextInt();

				switch (bookType) {
				case 1:
					libn.addHistoryBook(new Book(id, name, author, price, bookCount, null, null));
					break;
				case 2:
					libn.addStoryBook(new Book(id, name, author, price, bookCount, null, null));
					break;
				case 3:
					libn.addLiteratureBook(new Book(id, name, author, price, bookCount, null, null));
					break;
				case 4:
					libn.addArticleBook(new Book(id, name, author, price, bookCount, null, null));
					break;
				case 5:
					libn.addCompetativeBook(new Book(id, name, author, price, bookCount, null, null));
					break;
				case 6:
					libn.addSportsBook(new Book(id, name, author, price, bookCount, null, null));
					break;
				case 7:
					break;
				case 8:
					selectOption();
					break;
				default:
					System.out.println("You choosed an invalid option.......");
					break;
				}
				bookCount++;
			} else {
				System.out.println("Library is full");
			}

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Invalid Input....\nplease enter the proper input");
			// addBook();
			sc1.next();
			return;

		} // finally {
//			selectOption();
//		}
		// selectOption();
	}

	public void removeBook() {
		try {
			if (bookCount != 0) {
				System.out.println("enter the book id");
				int id = sc1.nextInt();
				sc1.nextLine();
				System.out.println("Choose which type of book to delete\n " 
						+ " 1) History\n "
						+ " 2) Stories\n "
						+ " 3) Literature\n"
						+ " 4) Articles\n" 
						+ " 5) Competative\n " 
						+ " 6) Sports\n "
						+ " 7) Dailies or Magazines\n ");
				int x = sc1.nextInt();
				switch (x) {
				case 1:
					libn.removeHistoryBook(id);
					break;
				case 2:
					libn.removeStoryBook(id);
					break;
				case 3:
					libn.removeLiteratureBook(id);
					break;
				case 4:
					libn.removeArticleBook(id);
					break;
				case 5:
					libn.removeCompetativeBook(id);
					break;
				case 6:
					libn.removeSportsBook(id);
					break;
				case 7:
					break;

				default:
					System.out.println("You choosed an invalid option.......");
					break;
				}
				if (libn.removeHistoryBook(id) || libn.removeLiteratureBook(id) || libn.removeStoryBook(id)
						|| libn.removeArticleBook(id) || libn.removeCompetativeBook(id) || libn.removeSportsBook(id)) {
					bookCount--;
				} else {
					System.out.println("Invalid Book details..!");
				}
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Invalid Input....\n please enter the proper input");
			sc1.next();
		} finally {
			selectOption();
		}
	}

	public void displayBooks() {
		if (bookCount > 0) {
			libn.displayBooks();
		} else {
			System.out.println("-------------------------");
		}
		// selectOption();
	}

	public void borrowBook() {
		try {
			if (bookCount > 0) {
				System.out.println("enter Borrower id ");
				int borrowerId = sc1.nextInt();
				sc1.nextLine();
				System.out.println("enter Book Id ");
				int BookId = sc1.nextInt();
				sc1.nextLine();
				System.out.println("Select the what type of book that borrowing...\n " 
						+ "1) History\n  "
						+ "2) Stories\n " 
						+ "3) Literature\n " 
						+ "4) Articles\n " 
						+ "5) Competative\n " 
						+ "6) Sports\n "
						+ "7) Dailies or Magazines\n ");
				int x = sc1.nextInt();
				switch (x) {
				case 1:
					libn.borrowHistoryBook(BookId, borrowerId);
					break;
				case 2:
					libn.borrowStoryBook(BookId, borrowerId);
					break;
				case 3:
					libn.borrowLiteratureBook(BookId, borrowerId);
					break;
				case 4:
					libn.borrowArticleBook(BookId, borrowerId);
					break;
				case 5:
					libn.borrowCompetativeBook(BookId, borrowerId);
					break;
				case 6:
					libn.borrowSportsBook(BookId, borrowerId);
					break;
				case 7:
					break;

				default:
					break;
				}

			} else {
				System.out.println("-------------------------");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Invalid Input....\n please enter the proper input");
			sc1.next();
			return;
		}
//		finally {
//			selectOption();
//		}
	}

	public void returnBook() {
		try {
			if (bookCount > 0) {
				System.out.println("enter Borrower id ");
				int borrowerId = sc1.nextInt();
				sc1.nextLine();
				System.out.println("enter Book Id ");
				int BookId = sc1.nextInt();
				sc1.nextLine();
				System.out.println("Select the what type of book that you returning...\n" 
									+ "1) History\n "
									+ "2) Stories\n " 
									+ "3) Literature\n " 
									+ "4) Articles\n " 
									+ "5) Competative\n " 
									+ "6) Sports\n "
									+ "7) Dailies or Magazines\n ");
				int x = sc1.nextInt();
				switch (x) {
				case 1:
					libn.returnHistoryBook(BookId, borrowerId);
					break;
				case 2:
					libn.returnStoryBook(BookId, borrowerId);
					break;
				case 3:
					libn.returnLiteratureBook(BookId, borrowerId);
					break;
				case 4:
					libn.returnArticleBook(BookId, borrowerId);
					break;
				case 5:
					libn.returnCompetativeBook(BookId, borrowerId);
					break;
				case 6:
					libn.returnSportsBook(BookId, borrowerId);
					break;
				case 7:
					break;

				default:
					break;
				}
				// libn.returnBook(borrowerId, BookId);
			} else {
				System.out.println("-------------------------");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Invalid Input....\n please enter the proper input");
			sc1.next();
			return;
		}
//		finally {
//			selectOption();
//		}
	}

	public void addAccount() {
		try {
			if (accountCount < libraryCapicityOnAccount) {
				System.out.println("enter Account id");
				int id = sc1.nextInt();
				sc1.nextLine();
				System.out.println("Enter your full name...");
				String aName = sc1.nextLine();

				boolean flag = true;
				for (int i = 0; i < Librarian.accounts.length; i++) {
					if (Librarian.accounts[i] != null) {
						if (id == Librarian.accounts[i].getAId()) {
							System.out.println("You already have an account.......");
							Librarian.accounts[i].toString();
							flag = false;
							break;
							// libn.addAccount(new Account(id, aName, new Book[5], 0, 0, new Book[100]));
						}
					}
				}
				if (flag) {
					for (int i = 0; i < Librarian.accounts.length; i++) {
						if (Librarian.accounts[i] == null) {
							libn.addAccount(new Account(id, aName, new Book[5], 0, 0, new Book[100]));
							accountCount++;
							break;
						}
					}
				}
				// libn.addAccount(new Account(id, null, null, id, id, null));;
			} else {
				System.out.println("Library is full");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Invalid Input....\n please enter the proper input");
			sc1.next();
			return;
		}
//		finally {
//			selectOption();
//		}
	}

	public void removeAccount() {
		try {
			if (accountCount != 0) {
				System.out.println("Enter Account holder id");
				int id = sc1.nextInt();
				if (libn.removeAccount(id)) {
					accountCount--;
				} else {
					System.out.println("no Account present in the library");
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input....\n please enter the proper input");
			sc1.next();
			return;
		}
//		finally {
//			selectOption();
//		}
	}

	public void searchBook() {
		System.out.println("Select the option to search book....\n" + "1) search by Book Id\n"
				+ "2) search by book name\n" + "3) search by author\n" + "4) exit");
		try {
			int x = sc1.nextInt();
			sc1.nextLine();
			switch (x) {
			case 1:
				searchBookById();
				break;
			case 2:
				searchBookByName();
				break;
			case 3:
				searchBookByAuthor();
				break;
			case 4:
				break;
			default:
				System.out.println("invalid choise.....");
				break;
			}
		} catch (Exception e) {
			System.out.println("enter the proper input (number)");
		}

	}

	public void searchBookById() {
		System.out.println("Enter the book Id..");
		int bookId = sc1.nextInt();
		sc1.nextLine();
		libn.searchBookById(bookId);
	}

	public void searchBookByName() {
		System.out.println("Enter the book Name..");
		String bookName = sc1.nextLine();
		libn.searchBookByName(bookName);
	}

	public void searchBookByAuthor() {
		System.out.println("Enter the book Author..");
		String bookAuthor = sc1.nextLine();
		libn.searchBookByAuthor(bookAuthor);
	}

	public void searchAccount() {
		System.out.println("Select the given options...\n" 
				+ "1) search by Id\n" 
				+ "2) search by name\n" 
				+ "3) exit");
		try {
			int x = sc1.nextInt();
			sc1.nextLine();
			switch (x) {
			case 1:
				lib.searchAccountById();
				break;
			case 2:
				lib.searchAccountByName();
				break;
			case 3:
				break;
			}
		} catch (Exception e) {
			System.out.println("Enter the proper input....");
		}
	}

	public void searchAccountById() {
		System.out.println("enter the account Id...");
		int accId = sc1.nextInt();
		sc1.nextLine();
		libn.searchAccountById(accId);
	}

	public void searchAccountByName() {
		System.out.println("enter the account holder name..");
		sc1.next();
		String accName = sc1.nextLine();
		libn.searchAccountByName(accName);
	}

	//yet to complete........
	public void donateBook() {
		System.out.println("enter account Id");
		int accId = sc1.nextInt();
		sc1.nextLine();
		System.out.println("Select the what type of book that you returning...\n" 
				+ "1) History\n "
				+ "2) Stories\n "
				+ "3) Literature\n " 
				+ "4) Articles\n "
				+ "5) Competative\n " 
				+ "6) Sports\n "
				+ "7) Dailies or Magazines\n ");
		int x = sc1.nextInt();
		switch (x) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;

		default:
			break;
		}
		// System.out.println("enter the book details");
		libn.donateBook(accId, new Book(accId, null, null, accId, accId, null, null));
	}


}
