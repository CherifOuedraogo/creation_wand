package com.burkindi.creationwandapi.creationwandapi.model;


import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "customers")
@Data
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotNull
    @Valid
    @Column(name = "email", nullable = false)
    private String email;

    @Valid
    @Column(name = "customer_phone_num")
    private String phone;

    @NotNull
    @Valid
    @Column(name = "customer_zipcode", nullable = false)
    private String zipCode;

    @Column(name = "comment_text")
    private String message;

    @Id
    @NotNull
    @Column(name = "Service_id", nullable = false)
    private String serviceId;

    public Customer() {
    }

    public Customer(String id, String lastName, String firstName, String email, String phone, String zipCode, String message, String serviceId) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.zipCode = zipCode;
        this.message = message;
        this.serviceId = serviceId;
    }

    public Customer(String lastName, String firstName, String email, String serviceId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.serviceId = serviceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", message='" + message + '\'' +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }
}
