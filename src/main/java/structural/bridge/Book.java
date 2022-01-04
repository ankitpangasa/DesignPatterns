package structural.bridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Book implements  Item{
    public Book(String classification, String title, String author, int pageCount) {
        this.classification = classification;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    String classification;
    String title, author;
    int pageCount;
    @Override
    public String getClassification() {
        return classification;
    }

    @Override
    public HashMap getDetails() {
        HashMap<String, Object> list= new HashMap<>();
        list.put("pages",pageCount);
        list.put("author",author );
        list.put("title",title );
        return list;
    }
}
