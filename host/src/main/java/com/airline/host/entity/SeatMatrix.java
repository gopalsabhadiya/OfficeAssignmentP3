package com.airline.host.entity;

import com.airline.host.entity.enums.SeatStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class SeatMatrix {

    @Id
    private Integer id;
    private SeatStatus a1 = SeatStatus.AVAILABLE;
    private SeatStatus c1 = SeatStatus.AVAILABLE;
    private SeatStatus b1 = SeatStatus.AVAILABLE;
    private SeatStatus d1 = SeatStatus.AVAILABLE;
    private SeatStatus e1 = SeatStatus.AVAILABLE;
    private SeatStatus f1 = SeatStatus.AVAILABLE;
    private SeatStatus a2 = SeatStatus.AVAILABLE;
    private SeatStatus b2 = SeatStatus.AVAILABLE;
    private SeatStatus c2 = SeatStatus.AVAILABLE;
    private SeatStatus d2 = SeatStatus.AVAILABLE;
    private SeatStatus e2 = SeatStatus.AVAILABLE;
    private SeatStatus f2 = SeatStatus.AVAILABLE;
    private SeatStatus a3 = SeatStatus.AVAILABLE;
    private SeatStatus b3 = SeatStatus.AVAILABLE;
    private SeatStatus c3 = SeatStatus.AVAILABLE;
    private SeatStatus d3 = SeatStatus.AVAILABLE;
    private SeatStatus e3 = SeatStatus.AVAILABLE;
    private SeatStatus f3 = SeatStatus.AVAILABLE;
}
