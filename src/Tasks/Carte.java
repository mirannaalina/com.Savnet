package Tasks;

import java.time.LocalDate;

public class Carte {

    private String author, title;
    private int rating;
    private LocalDate currDate;
    private LocalDate returnDate;

    public Carte(String author, String title, int rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
        currDate = LocalDate.now();

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}
