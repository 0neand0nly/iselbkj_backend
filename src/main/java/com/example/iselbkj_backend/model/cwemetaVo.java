package com.example.iselbkj_backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CWE")
public class cwemetaVo {

    @Id
    @Column(name ="Cwe_id")
    private Integer Cwe_id;
    @Column(name = "Cwe_name")
    private String Cwe_name;
    @Column(name = "IsSrcidt")
    private String IsSrcidt;
    @Column(name = "IsByteidt")
    private String SrcBad;
    @Column(name = "report")
    private String report;
    @Column(name = "conclusion")
    private String conclusion;

    @Column(name = "temp")
    private String temp;

    public Integer getCwe_id() {
        return Cwe_id;
    }

    public void setCwe_id(Integer cwe_id) {
        Cwe_id = cwe_id;
    }

    public String getCwe_name() {
        return Cwe_name;
    }

    public void setCwe_name(String cwe_name) {
        Cwe_name = cwe_name;
    }

    public String getIsSrcidt() {
        return IsSrcidt;
    }

    public void setIsSrcidt(String isSrcidt) {
        IsSrcidt = isSrcidt;
    }

    public String getSrcBad() {
        return SrcBad;
    }

    public void setSrcBad(String srcBad) {
        SrcBad = srcBad;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
