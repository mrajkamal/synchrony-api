package com.rk.synchronyapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private Long id;
    private String name;
    private String gender;
    private String emailId;
    private String phoneNumber;
    private String password;
    private Boolean isActive = true;
    private Integer loginCount = 0;
    private String ssoType;
    private DateTime loginAt;
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime createdAt;
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime updatedAt;

    @PrePersist
    public void onSave() {
        DateTime currentDateTime = new DateTime();

         this.createdAt = currentDateTime;
        this.updatedAt = currentDateTime;
    }

    @PostPersist
    public void onUpdate(){
        // update at
        DateTime currentDateTime = new DateTime();
        this.updatedAt = currentDateTime;
    }
}
