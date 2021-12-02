package com.serdardemirci.library.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private BookType typeId;

    @ManyToOne()
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author authorId;
}
