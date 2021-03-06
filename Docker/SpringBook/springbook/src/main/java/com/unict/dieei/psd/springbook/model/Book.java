package com.unict.dieei.psd.springbook.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
    @Id
    private ObjectId _id;
    private String name;
    private String author;
    private Integer pubblicationYear;

    @JsonCreator
    public Book(String name, String author, Integer pubblicationYear) {
        this.name = name;
        this.author = author;
        this.pubblicationYear = pubblicationYear;
    }


    @JsonGetter("_id")
    public String get_id_string() {
        return _id.toHexString();
    }

    // All default getters and setters ...

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPubblicationYear() {
        return pubblicationYear;
    }

    public void setPubblicationYear(Integer pubblicationYear) {
        this.pubblicationYear = pubblicationYear;
    }
}
