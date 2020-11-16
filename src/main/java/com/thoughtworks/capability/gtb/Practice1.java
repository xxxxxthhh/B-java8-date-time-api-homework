package com.thoughtworks.capability.gtb;
import	java.time.temporal.ChronoUnit;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;


/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate LaborDay = LocalDate.of(date.getYear(), 5, 1);
    long result = 0;
    if (date.isBefore(LaborDay)) {
      result = ChronoUnit.DAYS.between(date, LaborDay);
    } else {
      LocalDate NewLaborDay = LaborDay.plusYears(1);
      result = ChronoUnit.DAYS.between(date, NewLaborDay);
    }
    return result;
  }
}
