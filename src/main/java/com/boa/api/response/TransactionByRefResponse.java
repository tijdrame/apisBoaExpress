package com.boa.api.response;

public class TransactionByRefResponse extends GenericResponse {

    private String detailsop;

    private Integer codeop;

    private Status status;

    public TransactionByRefResponse() {}

    public TransactionByRefResponse(Integer codeop, String detailsop) {
        this.codeop = codeop;
        this.detailsop = detailsop;
    }

    public Integer getCodeop() {
        return this.codeop;
    }

    public void setCodeop(Integer codeop) {
        this.codeop = codeop;
    }

    public String getDetailsop() {
        return this.detailsop;
    }

    public void setDetailsop(String detailsop) {
        this.detailsop = detailsop;
    }

    public TransactionByRefResponse codeop(Integer codeop) {
        this.codeop = codeop;
        return this;
    }

    public TransactionByRefResponse detailsop(String detailsop) {
        this.detailsop = detailsop;
        return this;
    }

    public TransactionByRefResponse(Integer codeop, String detailsop, Status status) {
        this.codeop = codeop;
        this.detailsop = detailsop;
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TransactionByRefResponse status(Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " codeop='" + getCodeop() + "'" + ", detailsop='" + getDetailsop() + "'" + ", status='" + getStatus() + "'" + "}";
    }
}
