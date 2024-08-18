package com.PanicStatus.API;

import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
class StateTBL {
    @PrimaryKey
    private UUID id;

    private boolean state;

    private int change_time;

    StateTBL(UUID id, boolean state, int change_time) {
        this.id = id;
        this.state = state;
        this.change_time = change_time;
    }

    public UUID getId() {
        return id;
    }

    public boolean getState() {
        return state;
    }

    public int getchangeTime() {
        return change_time;
    }
}