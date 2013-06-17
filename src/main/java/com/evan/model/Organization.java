package com.evan.model;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: evank
 * Date: 6/17/13
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name="organization")
public class Organization extends BaseObject {
    private Long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    public Long getId() {
        return id;
    }

    @Column(nullable = false, length = 100)
    @Field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
