package cit59x.hackathon.mental_placeblog.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Quote {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "content")
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote = (Quote) o;
        return id == quote.id && Objects.equals(content, quote.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }
}
