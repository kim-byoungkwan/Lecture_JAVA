package kr.ac.kopo.javabasicproject01;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMangement{
	
	public void showMain() throws InterruptedException{
		
		while(true) {
			System.out.println("원하시는 도서관리 기능을 입력해주세요.");
			System.out.println("1=> 새로운 책 등록 2=> 등록된 책의 정보 수정 3=> 대여/반납 여부 수정 4=> 책의 정보 삭제 5=> 등록된 책의 정보 검색 0=>종료 " );
			
			int inputnum = sc.nextInt();
			
			switch(inputnum) {
			case(1):
				registerBook();
				break;
				
			case(2):
				modifyBook();
				break;
				
			case(3):
				inoutBook();
				break;
				
			case(4):
				deleteBook();
				break;
				
			case(5):
				searchBook();
				break;
				
			default:
				System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
		}
		
	}
	
	
	Scanner sc = new Scanner(System.in);

//	새로운 책의 정보를 등록하는 메소드
	public void registerBook() throws InterruptedException {
		
		while(true) {
			
			Book book = new Book();
			
			while(true) {
				
				boolean find = true;
				System.out.println("책 번호 입력");
				String temp = sc.nextLine();
				
				for(int i = 0; i < bookList.size(); i++) {
					if(temp.equals(bookList.get(i).getBookNum())) {
						find = false;
						System.out.println("이미 존재하는 책 입니다. 다시 입력하세요.");
						break
					}
				}
				if(find) {
					book.setBookNum(temp);
					break;
				}		
			}
			
			System.out.println("책의 제목을 입력하세요.");
			book.setTitle(sc.nextLine());
			System.out.println("책의 저자를 입력하세요.");
			book.setAuthor(sc.nextLine());
			System.out.println("책의 장르를 입력하세요.");
			book.setGenre(sc.nextLine());
			book.setAvailability(true);
			Thread.sleep(1000);

			System.out.println("입력된 책의 정보");
			System.out.println("책 고유 번호 :" + book.getBookNum());
			System.out.println("책 제목 :" + book.getTitle());
			System.out.println("책 저자 :" + book.getAuthor());
			System.out.println("책 장르 :" + book.getGenre());
			System.out.println("책 대여가능여부 :" + book.getAvailability());
			
			System.out.println("입력하신 책의 정보가 정확합니까? 예(Y) 아니오(N)");
			String check = sc.nextLine();
			
			if(check.equalsIgnoreCase("y")) {
				bookList.add(book);
				System.out.println("입력하신 책의 정보가 데이터베이스에 저장되었습니다.");
				break;
			} else if(check.equalsIgnoreCase("n")) {
				System.out.println("책의 정보를 재입력해주세요.");
			} else {
				System.out.println("잘못입력하셨습니다. 책의 정보를 재입력해주세요");
				break;
			}
		}
		Thread.sleep(1000);
	}

	
//  책 정보 수정하는 메소드
	public void modifyBook() throws InterruptedException {
		
		while(true) {
			
			System.out.println("정보를 수정하고 싶은 책의 고유 번호를 입력하세요.");
			int bookno = sc.nextInt();
			for(int i = 0; i < bookList.size(); i++) {
				if(bookno.equals(bookList.get(i).getBookNum())) {
					System.out.println("새로운 책의 제목을 입력하세요.");
					bookList.get(i).setTitle(sc.nextLine());
					System.out.println("새로운 책의 저자를 입력하세요.");
					bookList.get(i).setAuthor(sc.nextLine());
					System.out.println("새로운 책의 장르를 입력하세요.");
					bookList.get(i).setGenre(sc.nextLine());
					System.out.println("새로운 책의 위치를 입력하세요.");
					bookList.get(i).setBookPosition(sc.nextLine());

					System.out.println("책의 정보에 대한 수정이 완료됐습니다.");
					break;					
				}
			}
				
			System.out.println("입력한 책의 번호는 존재하지 않거나 잘못 입력하셨습니다.");		
		}
		
	}
	

//	책 대여/반납 여부를 변경하는 메소드
	public void inoutBook() throws InterruptedException {
		
		while(true) {
			
			System.out.println("대여/반납 한 책의 번호를 입력해주세요");
			boolean find = false;
			int bookno = sc.nextInt();
			
			for(int i = 0; i < bookList.size(); i++) {
				if(bookno.equals(bookList.get(i).getBookNum())) {
					boolean availability = bookList.get(i).getAvailability()
					find = true;
				}
			}
			
			if(find) {
				if(availability) {
					availability = false;
					System.out.println("책의 대여가 완료되었습니다.");
					System.out.println("현재 책의 상태 (true(보유)/false(미보유)) :" + availability);
					break;
				} else {
					availability = true;
					System.out.println("책의 반납이 완료되었습니다.");
					System.out.println("현재 책의 상태 (true(보유)/false(미보유)) :" + availability);
					break;
				}
			} else {
				System.out.println("잘못 입력하셨습니다. 책의 번호를 다시 입력해주세요.");
			}
		}
	}
	
// 등록된 책의 정보를 삭제하는 메소드	
	public void deleteBook() throws InterruptedException {
		
		while(true) {
			
			System.out.println("삭제할 책의 번호를 입력해주세요.");
			boolean find = false;
			int bookno = sc.nextInt();
			
			for(int i = 0; bookList.size(); i++) {
				if(bookno.equals(bookList.get(i).getBookNum())) {
					bookList.remove(i);
					find = true;
					break;
				}
			}
			
			if(find) {
				
				System.out.println("등록된 책의 삭제가 완료되었습니다.");
			}
		}
	}
	
//	등록된 책의 정보를 조회하는 메소드
	public void searchBook() {
		
		while(true) {
			System.out.println("찾고 싶은 책의 번호를 입력해주세요.");
			int bookno = sc.nextInt();
			boolean find = false;
			
			for(int i = 0; i < bookList.size(); i++) {
				if(bookno.equals(bookList.get(i).getBookNum())) {
					
					System.out.println("----------------------------------");
					System.out.println("책 번호 :" + bookList.get(i).getBookNum());
					System.out.println("책 제목 :" + bookList.get(i).getTitle());
					System.out.println("저자 :" + bookList.get(i).getAuthor());
					System.out.println("장르 :" + bookList.get(i).getGenre());
					System.out.println("보관위치 :" + bookList.get(i).getbookposition());
					System.out.println("대여가능여부 :" + bookList.get(i).getAvailability());
					
					find = true;
					break;
				}
			}
			
			if(find) {
				System.out.println("책의 조회가 성공했습니다.");
				break;
			} else {
				System.out.println("찾고자하는 책이 존재하지 않거나, 잘못된 책의 번호를 입력하셨습니다.");
			}
		}
	}
}
