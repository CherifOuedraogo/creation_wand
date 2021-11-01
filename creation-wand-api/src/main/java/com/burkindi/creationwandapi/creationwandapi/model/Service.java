package com.burkindi.creationwandapi.creationwandapi.model;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Table(name = "services")
@Data
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Service implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "service_id", nullable = false)
    private String serviceId;

    @Column(name = "Service_description", nullable = false)
    private String description;

    @NotNull
    @Column(name = "physical_location", nullable = false)
    private String location;

    @Id
    @NotNull
    @Column(name = "customer_id", nullable = false)
    private String customerId;

    public Service(){

    }

    public Service(String serviceId, String description, String location, String customerId) {
        this.serviceId = serviceId;
        this.description = description;
        this.location = location;
        this.customerId = customerId;
    }

    public Service(String serviceId, String description, String customerId) {
        this.serviceId = serviceId;
        this.description = description;
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId='" + serviceId + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
