package com.zerobase.springmission.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 예약 요청 객체
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {
    private String memberId;
    private String storeName;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
}
