package com.evan.model;

import org.hibernate.search.annotations.DocumentId;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: evank
 * Date: 6/17/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name="profile_field_value")
public class ProfileFieldValue extends BaseObject {
    private Long id;
    private User user;
    private ProfileField profileField;
    private String fieldValue;

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
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public ProfileField getProfileField() {
        return profileField;
    }

    public void setProfileField(ProfileField profileField) {
        this.profileField = profileField;
    }

    @Column(name="field_value", length=255)
    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
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
