package org.jh.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/8/31 21:01
 */
public class BookShelf implements Aggregation {
    private int last;
    private Book[] books;

    public BookShelf(int size) {
        last = 0;
        books = new Book[size];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
