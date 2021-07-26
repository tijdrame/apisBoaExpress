package com.boa.api.response;

public class Fraistransaction {

    private String codepartenaire;
    private String paysenvoi;
    private String deviseenvoi;
    private String paysdestination;
    private String devisedestination;
    private Integer typetransaction;
    private Double montant;
    private Double frais;
    private Double tva;
    private Double autretaxe1;
    private Double autretaxe2;
    private Double autretaxe3;
    private Double montantAuPaiement;
    private Double montantsendenusd;

    public Fraistransaction() {}

    public Fraistransaction(
        String codepartenaire,
        String paysenvoi,
        String deviseenvoi,
        String paysdestination,
        String devisedestination,
        Integer typetransaction,
        Double montant,
        Double frais,
        Double tva,
        Double autretaxe1,
        Double autretaxe2,
        Double autretaxe3,
        Double montantAuPaiement,
        Double montantsendenusd
    ) {
        this.codepartenaire = codepartenaire;
        this.paysenvoi = paysenvoi;
        this.deviseenvoi = deviseenvoi;
        this.paysdestination = paysdestination;
        this.devisedestination = devisedestination;
        this.typetransaction = typetransaction;
        this.montant = montant;
        this.frais = frais;
        this.tva = tva;
        this.autretaxe1 = autretaxe1;
        this.autretaxe2 = autretaxe2;
        this.autretaxe3 = autretaxe3;
        this.montantAuPaiement = montantAuPaiement;
        this.montantsendenusd = montantsendenusd;
    }

    public String getCodepartenaire() {
        return this.codepartenaire;
    }

    public void setCodepartenaire(String codepartenaire) {
        this.codepartenaire = codepartenaire;
    }

    public String getPaysenvoi() {
        return this.paysenvoi;
    }

    public void setPaysenvoi(String paysenvoi) {
        this.paysenvoi = paysenvoi;
    }

    public String getDeviseenvoi() {
        return this.deviseenvoi;
    }

    public void setDeviseenvoi(String deviseenvoi) {
        this.deviseenvoi = deviseenvoi;
    }

    public String getPaysdestination() {
        return this.paysdestination;
    }

    public void setPaysdestination(String paysdestination) {
        this.paysdestination = paysdestination;
    }

    public String getDevisedestination() {
        return this.devisedestination;
    }

    public void setDevisedestination(String devisedestination) {
        this.devisedestination = devisedestination;
    }

    public Integer getTypetransaction() {
        return this.typetransaction;
    }

    public void setTypetransaction(Integer typetransaction) {
        this.typetransaction = typetransaction;
    }

    public Double getMontant() {
        return this.montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Double getFrais() {
        return this.frais;
    }

    public void setFrais(Double frais) {
        this.frais = frais;
    }

    public Double getTva() {
        return this.tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public Double getAutretaxe1() {
        return this.autretaxe1;
    }

    public void setAutretaxe1(Double autretaxe1) {
        this.autretaxe1 = autretaxe1;
    }

    public Double getAutretaxe2() {
        return this.autretaxe2;
    }

    public void setAutretaxe2(Double autretaxe2) {
        this.autretaxe2 = autretaxe2;
    }

    public Double getAutretaxe3() {
        return this.autretaxe3;
    }

    public void setAutretaxe3(Double autretaxe3) {
        this.autretaxe3 = autretaxe3;
    }

    public Double getMontantAuPaiement() {
        return this.montantAuPaiement;
    }

    public void setMontantAuPaiement(Double montantAuPaiement) {
        this.montantAuPaiement = montantAuPaiement;
    }

    public Double getMontantsendenusd() {
        return this.montantsendenusd;
    }

    public void setMontantsendenusd(Double montantsendenusd) {
        this.montantsendenusd = montantsendenusd;
    }

    public Fraistransaction codepartenaire(String codepartenaire) {
        setCodepartenaire(codepartenaire);
        return this;
    }

    public Fraistransaction paysenvoi(String paysenvoi) {
        setPaysenvoi(paysenvoi);
        return this;
    }

    public Fraistransaction deviseenvoi(String deviseenvoi) {
        setDeviseenvoi(deviseenvoi);
        return this;
    }

    public Fraistransaction paysdestination(String paysdestination) {
        setPaysdestination(paysdestination);
        return this;
    }

    public Fraistransaction devisedestination(String devisedestination) {
        setDevisedestination(devisedestination);
        return this;
    }

    public Fraistransaction typetransaction(Integer typetransaction) {
        setTypetransaction(typetransaction);
        return this;
    }

    public Fraistransaction montant(Double montant) {
        setMontant(montant);
        return this;
    }

    public Fraistransaction frais(Double frais) {
        setFrais(frais);
        return this;
    }

    public Fraistransaction tva(Double tva) {
        setTva(tva);
        return this;
    }

    public Fraistransaction autretaxe1(Double autretaxe1) {
        setAutretaxe1(autretaxe1);
        return this;
    }

    public Fraistransaction autretaxe2(Double autretaxe2) {
        setAutretaxe2(autretaxe2);
        return this;
    }

    public Fraistransaction autretaxe3(Double autretaxe3) {
        setAutretaxe3(autretaxe3);
        return this;
    }

    public Fraistransaction montantAuPaiement(Double montantAuPaiement) {
        setMontantAuPaiement(montantAuPaiement);
        return this;
    }

    public Fraistransaction montantsendenusd(Double montantsendenusd) {
        setMontantsendenusd(montantsendenusd);
        return this;
    }

    @Override
    public String toString() {
        return (
            "{" +
            " codepartenaire='" +
            getCodepartenaire() +
            "'" +
            ", paysenvoi='" +
            getPaysenvoi() +
            "'" +
            ", deviseenvoi='" +
            getDeviseenvoi() +
            "'" +
            ", paysdestination='" +
            getPaysdestination() +
            "'" +
            ", devisedestination='" +
            getDevisedestination() +
            "'" +
            ", typetransaction='" +
            getTypetransaction() +
            "'" +
            ", montant='" +
            getMontant() +
            "'" +
            ", frais='" +
            getFrais() +
            "'" +
            ", tva='" +
            getTva() +
            "'" +
            ", autretaxe1='" +
            getAutretaxe1() +
            "'" +
            ", autretaxe2='" +
            getAutretaxe2() +
            "'" +
            ", autretaxe3='" +
            getAutretaxe3() +
            "'" +
            ", montantAuPaiement='" +
            getMontantAuPaiement() +
            "'" +
            ", montantsendenusd='" +
            getMontantsendenusd() +
            "'" +
            "}"
        );
    }
}
