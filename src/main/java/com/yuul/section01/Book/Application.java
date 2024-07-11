package com.yuul.section01.Book;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        String title;
        String author;
        int bookCode;

        while(true){
            System.out.println("도서 관리 프로그램");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("0. 종료");
            System.out.println("====================");
            System.out.print("번호를 선택해주세요 :");

            Scanner sc =new Scanner(System.in);
            int num =sc.nextInt();

            switch (num){
                case 1:
                    System.out.print("도서명 :");
                    title =sc.nextLine();
                    System.out.println("도서 코드 :");
                    bookCode =sc.nextInt();
                    System.out.print("작가명 :");
                    author =sc.nextLine();
                    break;
                case 2:
                    System.out.println("추가된 도서 리스트 :");

                    break;
                case 3:
                    System.out.println("수정할 도서 :");
                    break;
                case 4:
                    System.out.println("삭제할 도서 :");
                    break;
                case 0:
                    System.out.println("프로그램을 종료하겠습니다...");
                    break;
                default:
                    System.out.println("========== 번호를 잘 못 입력하셨습니다. ==========");
            }
        }
    }
}
