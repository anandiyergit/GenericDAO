package com.tibco.amx.dgnt.genericdao.model;

import java.io.Serializable;
import java.util.Date;
/**
 * This class represents the User model. This model class can be used thoroughout all
 * layers, the data layer, the controller layer and the view layer.
 * 
 * @author aniyer
 *
 */
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    // Properties
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Date birthdate;
    
    // Getters/Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    
    // Object Overrides
    @Override
    public boolean equals(Object other) {
        return (other instanceof User) && (id != null)
             ? id.equals(((User) other).id)
             : (other == this);
    }
    /**
     * The user ID is unique for each User. So User with same ID should return same hashcode.
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return (id != null) 
             ? (this.getClass().hashCode() + id.hashCode()) 
             : super.hashCode();
    }

    /**
     * Returns the String representation of this User. Not required, it just pleases reading logs.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("User[id=%d,email=%s,firstname=%s,lastname=%s,birthdate=%s]", 
            id, email, firstName, lastName, birthdate);
    }
}
