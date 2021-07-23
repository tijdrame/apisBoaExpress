package com.boa.api.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

/**
 * A Tracking.
 */
@Entity
@Table(name = "tracking")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Tracking implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "tracking_seq_gen")
    @SequenceGenerator(name = "tracking_seq_gen", sequenceName = "tracking_id_seq", initialValue = 1, allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "code_response", nullable = false)
    private String codeResponse;

    @NotNull
    @Column(name = "end_point", nullable = false)
    private String endPoint;

    @NotNull
    @Column(name = "login_acteur", nullable = false)
    private String loginActeur;

    @NotNull
    @Column(name = "request_id", nullable = false)
    private String requestId;

    @NotNull
    @Column(name = "date_request", nullable = false)
    private Instant dateRequest;

    @NotNull
    @Column(name = "date_response", nullable = false)
    private Instant dateResponse;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "request_tr", nullable = false)
    private String requestTr;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "response_tr", nullable = false)
    private String responseTr;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeResponse() {
        return codeResponse;
    }

    public Tracking codeResponse(String codeResponse) {
        this.codeResponse = codeResponse;
        return this;
    }

    public void setCodeResponse(String codeResponse) {
        this.codeResponse = codeResponse;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public Tracking endPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getLoginActeur() {
        return loginActeur;
    }

    public Tracking loginActeur(String loginActeur) {
        this.loginActeur = loginActeur;
        return this;
    }

    public void setLoginActeur(String loginActeur) {
        this.loginActeur = loginActeur;
    }

    public String getRequestId() {
        return requestId;
    }

    public Tracking requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Instant getDateRequest() {
        return dateRequest;
    }

    public Tracking dateRequest(Instant dateRequest) {
        this.dateRequest = dateRequest;
        return this;
    }

    public void setDateRequest(Instant dateRequest) {
        this.dateRequest = dateRequest;
    }

    public Instant getDateResponse() {
        return dateResponse;
    }

    public Tracking dateResponse(Instant dateResponse) {
        this.dateResponse = dateResponse;
        return this;
    }

    public void setDateResponse(Instant dateResponse) {
        this.dateResponse = dateResponse;
    }

    public String getRequestTr() {
        return requestTr;
    }

    public Tracking requestTr(String requestTr) {
        this.requestTr = requestTr;
        return this;
    }

    public void setRequestTr(String requestTr) {
        this.requestTr = requestTr;
    }

    public String getResponseTr() {
        return responseTr;
    }

    public Tracking responseTr(String responseTr) {
        this.responseTr = responseTr;
        return this;
    }

    public void setResponseTr(String responseTr) {
        this.responseTr = responseTr;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tracking)) {
            return false;
        }
        return id != null && id.equals(((Tracking) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return (
            "Tracking{" +
            "id=" +
            getId() +
            ", codeResponse='" +
            getCodeResponse() +
            "'" +
            ", endPoint='" +
            getEndPoint() +
            "'" +
            ", loginActeur='" +
            getLoginActeur() +
            "'" +
            ", requestId='" +
            getRequestId() +
            "'" +
            ", dateRequest='" +
            getDateRequest() +
            "'" +
            ", dateResponse='" +
            getDateResponse() +
            "'" +
            ", requestTr='" +
            getRequestTr() +
            "'" +
            ", responseTr='" +
            getResponseTr() +
            "'" +
            "}"
        );
    }
}
