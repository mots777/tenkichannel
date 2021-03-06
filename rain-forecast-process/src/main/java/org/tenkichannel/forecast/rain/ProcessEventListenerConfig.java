package org.tenkichannel.forecast.rain;

import javax.enterprise.context.ApplicationScoped;

import org.kie.addons.monitoring.process.PrometheusProcessEventListener;
import org.kie.kogito.process.impl.DefaultProcessEventListenerConfig;

@ApplicationScoped
public class ProcessEventListenerConfig extends DefaultProcessEventListenerConfig {
    
    public ProcessEventListenerConfig() {
        super(new PrometheusProcessEventListener("rain-forecast-process"));
    }
    
}
