package com.znaji.springevents.handler;

import com.znaji.springevents.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class HousekeepingServiceHandler {
    @EventListener
    @Async
    public void cleanRoom(PatientDischargeEvent event) {
        System.out.printf("cleaning room for patient %s, handled by thread %s%n", event.getPatientName(), Thread.currentThread().getName());
    }
}
