package com.example.iselbkj_backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CHUNK")
public class chunkVo {

    @Id
    @Column(name ="Cwe_id")
    private Integer Cwe_id;
    @Column(name = "Cwe_name")
    private String Cwe_name;
    @Column(name = "source_code")
    private String source_code;

    @Column(name = "byte_code")
    private String byte_code;

    public String getSource_code() {
        return source_code;
    }

    public void setSource_code(String source_code) {
        this.source_code = source_code;
    }

    public String getByte_code() {
        return byte_code;
    }

    public void setByte_code(String byte_code) {
        this.byte_code = byte_code;
    }




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



}


