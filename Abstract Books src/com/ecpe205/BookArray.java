package com.ecpe205;

public class BookArray {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Fiction("Fahrenheit 451");
        books[1] = new NonFiction("The Autobiography of Malcom X");
        books[2] = new Fiction("The Adventures of Huckleberry Finn");
        books[3] = new NonFiction("Into the Wild");
        books[4] = new Fiction("Frankenstein");
        books[5] = new NonFiction("Way to Success");
        books[6] = new Fiction("Go Tell the Bees That I Am Gone");
        books[7] = new NonFiction("In Cold Blood");
        books[8] = new Fiction("A Gambling Man");
        books[9] = new NonFiction("A Brief History of Time");

        for(int x = 0; x < books.length; ++x){
            System.out.println("BOOK: \"" + books[x].getTitle() + "\" IS $" + books[x].getBookPrice());
        }
    }
}
