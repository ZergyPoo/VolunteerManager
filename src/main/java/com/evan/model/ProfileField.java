package com.evan.model;

import org.hibernate.search.annotations.DocumentId;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: evank
 * Date: 6/17/13
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name="profile_field")
public class ProfileField extends BaseObject {
    private Long id;
    private Organization organization;
    private String label;
    private String name;
    private ProfileFieldType type;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Column(name="label", length=100)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Column(name="name", length=100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne
    public ProfileFieldType getType() {
        return type;
    }

    public void setType(ProfileFieldType type) {
        this.type = type;
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
