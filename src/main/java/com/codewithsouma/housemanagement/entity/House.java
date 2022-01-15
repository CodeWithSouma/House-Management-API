package com.codewithsouma.housemanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "HOUSE_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class House {
    @Id
    private long houseId;
    private long houseNo;
    private String status;
    private String type;
}
