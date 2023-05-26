import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void addAuthors(String authorName) {
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
