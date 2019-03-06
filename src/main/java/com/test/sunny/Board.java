package com.test.sunny;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Board {

    @Id
    @GeneratedValue
    int idx;

    @Column(length = 64)
    String title;
    String writer;
    @Column(length = 100000000)
    String content;
    Date date;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Board() {
    }

    public Board(String title, String writer, String content, Date date) {
        this.idx = idx;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.date = date;
    }
}
