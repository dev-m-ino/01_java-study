package com.kyungbae.section04.run;

import com.kyungbae.section04.dto.Book;

public class Application1 {

    public static void main(String[] args) {

        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);

        System.out.println("book1: " + book1);
        System.out.println("book1.toString(): " + book1.toString());

        System.out.println("book2: " + book2);
        System.out.println("book2.toString(): " + book2.toString());

    }


}
