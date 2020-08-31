package org.jh.iterator;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/8/31 21:10
 */
public class BookShelfIterator implements Iterator {
    private int index;
    private BookShelf bookShelf;

    public BookShelfIterator(BookShelf bookShelf) {
        this.index = 0;
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
