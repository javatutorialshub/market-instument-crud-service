package com.javatutorialshub.market.entity;

import org.springframework.data.domain.Persistable;


public abstract class AbstractEntity<I> implements Persistable<I> {

    private boolean isNew = true;

    @Override
    public boolean isNew() {
        return isNew;
    }

    public void markNotNew() {
        isNew = false;
    }
}
