package com.znaji.springevents.service;

import com.znaji.springevents.event.PatientDischargeEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientDischargeService {

    private final ApplicationEventPublisher eventPublisher;
    public void dischargePatient(String patientName, String patientId) {
        eventPublisher.publishEvent(new PatientDischargeEvent(this, patientName, patientId));
    }
}
