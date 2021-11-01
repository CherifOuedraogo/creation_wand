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
@Table(name ="quotes")
@Data
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class QuoteRequest implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @NotNull
    @Column(name = "quote_id", nullable = false)
    private String quoteId;

    @Id
    @NotNull
    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @Id
    @NotNull
    @Column(name = "service_id", nullable = false)
    private String serviceId;

    @Column(name = "estimated_budget", nullable = false)
    private String budget;

    @Column(name = "request_urgency")
    private String urgency;

    public QuoteRequest() {
    }

    public QuoteRequest(String quoteId, String customerId, String serviceId, String budget, String urgency) {
        this.quoteId = quoteId;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.budget = budget;
        this.urgency = urgency;
    }

    public QuoteRequest(String quoteId, String customerId, String serviceId) {
        this.quoteId = quoteId;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "QuoteRequest{" +
                "quoteId='" + quoteId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", budget='" + budget + '\'' +
                ", urgency='" + urgency + '\'' +
                '}';
    }
}
