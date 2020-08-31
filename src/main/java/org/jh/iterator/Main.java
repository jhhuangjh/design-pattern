package org.jh.iterator;

/**
 * Iterator迭代器模式
 *
 * @author hjh
 * @version 1.0
 * @date 2020/8/31 21:16
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
