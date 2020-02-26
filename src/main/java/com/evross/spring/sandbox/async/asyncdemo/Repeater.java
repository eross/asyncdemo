package com.evross.spring.sandbox.async.asyncdemo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


@Slf4j
@Component
@EnableScheduling
public class Repeater {

    @Value("${repeater.interval}")
    private int interval;

    @Scheduled(fixedRateString="${repeater.interval}")
    public void tick() {
        log.info("tick");
    }
}
