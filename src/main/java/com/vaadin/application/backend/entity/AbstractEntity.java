package com.vaadin.application.backend.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public Long getId(){
        return id;
    }

    boolean isPersisted(){
        return id != null;
    }

    @Override
    public int hashCode() {
        if (getId() != null){
            return getId().hashCode();
        }
        return super.hashCode();
    }


}
