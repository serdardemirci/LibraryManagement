package com.serdardemirci.library.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_rent")
public class BookRent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student studentId;

    @ManyToOne()
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book bookId;
}
