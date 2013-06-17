package com.evan.model;

import org.hibernate.search.annotations.DocumentId;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: evank
 * Date: 6/17/13
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name="profile_field_type")
public class ProfileFieldType extends BaseObject {
    private Long id;
    private String type;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="type", length=50, nullable=false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object o) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int hashCode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
