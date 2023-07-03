package com.example.iselbkj_backend.model;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;


@Entity
@Table(name="demo")
public class cweDao {
    @Id
    @Column(name ="Cwe_id")
    private Integer Cwe_id;
    @Column(name = "Cwe_name")
    private String Cwe_name;
    @Column(name = "SrcGood")
    private String SrcGood;
    @Column(name = "SrcBad")
    private String SrcBad;
    @Column(name = "ByteGood")
    private String ByteGood;
    @Column(name = "ByteBad")
    private String ByteBad;

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

    public String getSrcGood() {
        return SrcGood;
    }

    public void setSrcGood(String srcGood) {
        SrcGood = srcGood;
    }

    public String getSrcBad() {
        return SrcBad;
    }

    public void setSrcBad(String srcBad) {
        SrcBad = srcBad;
    }

    public String getByteGood() {
        return ByteGood;
    }

    public void setByteGood(String byteGood) {
        ByteGood = byteGood;
    }

    public String getByteBad() {
        return ByteBad;
    }

    public void setByteBad(String byteBad) {
        ByteBad = byteBad;
    }
}


