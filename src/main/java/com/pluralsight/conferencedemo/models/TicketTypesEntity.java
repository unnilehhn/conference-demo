package com.pluralsight.conferencedemo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_types")
public class TicketTypesEntity {

    @Id
    @Column(name = "ticket_type_code")
    private String code;

    @Column(name = "ticket_type_name")
    private String name;

    @Column(name = "description")
    private String descripton;

    @Column(name = "includes_workshop")
    private String workshop;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    @Override
    public String toString() {
        return "TicketTypesEntity{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", descripton='" + descripton + '\'' +
                ", workshop='" + workshop + '\'' +
                '}';
    }
}
