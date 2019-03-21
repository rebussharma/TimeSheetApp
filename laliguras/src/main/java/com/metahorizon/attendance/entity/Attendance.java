package com.metahorizon.attendance.entity;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Asus on 5/16/2018.
 */
@Entity
@Builder
public class Attendance {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private Timestamp punchIn;
    private Timestamp punchOut;
}
