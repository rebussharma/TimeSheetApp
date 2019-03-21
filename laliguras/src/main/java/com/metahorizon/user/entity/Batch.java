package com.metahorizon.user.entity;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Asus on 5/16/2018.
 */
@Entity
@Builder
public class Batch {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String startMonth;
    private String endMonth;
    private String name;
}
