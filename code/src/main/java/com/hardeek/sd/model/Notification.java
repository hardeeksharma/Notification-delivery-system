package com.hardeek.sd.model;

import com.hardeek.sd.model.sql.AuditModel;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Notification extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String userUuid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }
}
