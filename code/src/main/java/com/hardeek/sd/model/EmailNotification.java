package com.hardeek.sd.model;

import javax.persistence.Column;
import javax.persistence.Entity;

public class EmailNotification extends Notification {

    @Column(nullable = false)
    private String to;

    @Column(nullable = false)
    private String from;

    @Column(columnDefinition = "LONGTEXT")
    private String messageTemplate;


}
