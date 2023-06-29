package com.example.bkj_backend.model;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="board")
@DynamicInsert
@DynamicUpdate
public class cweDao {
    @Id
    private String Cwe_id;
    @Column(name = "cwename")
    private String Cwe_name;
    @Column(name = "srcgood")
    private String SrcGood;
    @Column(name = "srcbad")
    private String SrcBad;
    @Column(name = "bytegood")
    private String ByteGood;
    @Column(name = "byte")
    private String ByteBad;

}