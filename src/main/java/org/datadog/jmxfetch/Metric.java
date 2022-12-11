package org.datadog.jmxfetch;

import java.util.Arrays;

/**
 * Metric carrier class.
 */
public class Metric {
    private final String alias;
    private final String metricType;
    private final String[] tags;
    private final String checkName;
    private double value;


    /**
     * Metric constructor.
     */
    public Metric(String alias, String metricType, String[] tags, String checkName) {
        this.alias = alias;
        this.metricType = metricType;
        this.tags = tags;
        this.checkName = checkName;
        Arrays.sort(this.tags);
    }

    public String getAlias() {
        return alias;
    }

    public String getMetricType() {
        return metricType;
    }

    public double getValue() {
        return value;
    }

    public String[] getTags() {
        return tags;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
