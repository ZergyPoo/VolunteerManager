package com.evan.model;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: evank
 * Date: 6/26/13
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name="season")
public class Season extends BaseObject {
    private Long id;
    private String name;
    private Organization organization;
    private boolean isCurrent;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false, length = 100)
    @Field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Column(name="current")
    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        this.isCurrent = current;
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
