package com.znaji.springevents.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class PatientDischargeEvent extends ApplicationEvent {

    private String patientName;
    private String patientId;

    public PatientDischargeEvent(Object source, String patientName, String patientId) {
        super(source);
        this.patientName = patientName;
        this.patientId = patientId;
    }
}
