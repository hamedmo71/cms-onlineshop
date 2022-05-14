package com.maktab74.Entity;

public class ReadableProdocts extends Products {
    private String type;
    private String publisher;
    private String author;
    private String numberOfPages;

    public ReadableProdocts() {
    }

    public ReadableProdocts(int id, double price, String type, String publisher, String author, String numberOfPages) {
        super(id, price);
        this.type = type;
        this.publisher = publisher;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "ReadableProdocts{" +
                "type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                '}';
    }
}
