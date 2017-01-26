package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35987 {
    private final Productionnull_35987 production = new Productionnull_35987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}