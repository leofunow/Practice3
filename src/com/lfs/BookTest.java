package com.lfs;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("War and Peace", "Tolstoi", 1867, "novel"));
        System.out.println(library.get(0));
    }
}
