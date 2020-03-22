package com.jsc.oauth.model;

import java.io.Serializable;

/**
 * The type Custom principal.
 */
public class CustomPrincipal implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String email;

    /**
     * Instantiates a new Custom principal.
     */
    public CustomPrincipal() {

    }

    /**
     * Instantiates a new Custom principal.
     *
     * @param username the username
     * @param email    the email
     */
    public CustomPrincipal(String username, String email) {
        this.username = username;
        this.email = email;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}