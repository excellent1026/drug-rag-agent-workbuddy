package com.drugrag.entity;

public class Drug {
    private Long id;
    private String drugName;
    private String drugType;
    private String drugUsage;
    private String contraindication;
    private String effect;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDrugName() { return drugName; }
    public void setDrugName(String drugName) { this.drugName = drugName; }
    public String getDrugType() { return drugType; }
    public void setDrugType(String drugType) { this.drugType = drugType; }
    public String getDrugUsage() { return drugUsage; }
    public void setDrugUsage(String drugUsage) { this.drugUsage = drugUsage; }
    public String getContraindication() { return contraindication; }
    public void setContraindication(String contraindication) { this.contraindication = contraindication; }
    public String getEffect() { return effect; }
    public void setEffect(String effect) { this.effect = effect; }
}
