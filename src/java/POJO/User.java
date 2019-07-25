/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.io.Serializable;

/**
 *
 * @author patel
 */
public class User implements Serializable{
    String name,id,email,github,linkdin;
    Long phone;

    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkdin() {
        return linkdin;
    }

    public void setLinkdin(String linkdin) {
        this.linkdin = linkdin;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
    
    public User(String name, String id, String email, String github, String linkdin, Long phone) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.github = github;
        this.linkdin = linkdin;
        this.phone = phone;
    }
    
    public User()
    {
        
    }

    
}
