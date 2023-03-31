package com.test.metadata.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class TestMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Type(type = "jsonb")
    private List<Meta> metaList;
}
