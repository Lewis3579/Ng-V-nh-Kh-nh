package Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public void addAuthor(String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i) == authorName) {
                return;
            }
        }
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i) == authorName) {
                authors.remove(i);
            }
        }
    }

    public Book(String title, String category, int id, float cost, String author) {
        addAuthor(author);
        setCategory(category);
        setCost(cost);
        setID(id);
        setTitle(title);
    }

    public String toString(Book o) {
        String str = this.getTitle() + this.getCategory() + this.getID() + this.getCost();
        return str;
    }
}
