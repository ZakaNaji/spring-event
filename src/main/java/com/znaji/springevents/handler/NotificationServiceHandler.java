package com.znaji.springevents.handler;

import com.znaji.springevents.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceHandler {
    @EventListener
    @Async
    public void sendNotification(PatientDischargeEvent event) {
        System.out.printf("sending notification to patient %s with id %s, handled by thread %s%n", event.getPatientName(), event.getPatientId(), Thread.currentThread().getName());
    }
}
