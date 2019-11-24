package Session4;

import java.time.LocalDate;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        List<Book> gregsBooks = getgregsBooks();


        List<Book> johnBooks = getjohnBooks();



      //  System.out.println(gregsBooks);

      //  System.out.println(johnBooks);

		/*
		 * -----------------------------------------------------------------------------
		 */

        Iterator it = gregsBooks.iterator();

        while (it.hasNext()) {
            Book b = (Book) it.next();

			/* Fiindca folosim LocalDate, vom compara datele folosind metoda compareTo() */
            if (b.getCurrDate().compareTo(b.getReturnDate()) > 0) {
                it.remove();
            }

        }





        Map<String, List> bookMap =  new HashMap();
        bookMap.put("Alina", gregsBooks);
        bookMap.put("Alex", johnBooks);


        for(List<Book> h : bookMap.values())
            {
                for(Book b : h){
                    if(b.getRating()==5){
                        System.out.println(b);
                    }
                }
            }



        //System.out.println(gre   fbgsBooks);

		/*
		 * -----------------------------------------------------------------------------
		 */



    }

    public static List<Book> getjohnBooks() {
        List<Book> johnBooks = new ArrayList<>();

        johnBooks.add(new Book("Osho", "Faima si bogatie", 1, LocalDate.of(2019, 10, 13)));
        johnBooks.add(new Book("Dan Brown", "Simbolul pierdut", 7, LocalDate.of(2019, 11, 5)));
        johnBooks.add(new Book("Hector Malot", "Singur pe lume", 1, LocalDate.of(2019, 8, 16)));
        johnBooks.add(new Book("Dan Brown", "Origini", 3, LocalDate.of(2019, 12, 7)));
        johnBooks.add(new Book("Gustave Flaubert", "Madame Bovary", 5, LocalDate.of(2019, 11, 20)));
        return johnBooks;
    }

    public static List<Book> getgregsBooks() {

        List<Book> gregsBooks = new ArrayList<>();

        gregsBooks.add(new Book("Dan Brown", "Ingeri si demoni", 4, LocalDate.of(2019, 10, 13)));
        gregsBooks.add(new Book("F. Dostoievski", "Crima si pedeapsa", 5, LocalDate.of(2019, 11, 5)));
        gregsBooks.add(new Book("Alexandre Dumas fiul", "Dama cu camelii", 2, LocalDate.of(2019, 8, 16)));
        gregsBooks.add(new Book("Dan Brown", "Origini", 3, LocalDate.of(2019, 12, 7)));
        gregsBooks.add(new Book("Gustave Flaubert", "Madame Bovary", 5, LocalDate.of(2019, 11, 20)));
        return gregsBooks;
    }


}
