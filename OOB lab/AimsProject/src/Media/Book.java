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

    public Book() {

    }
}
