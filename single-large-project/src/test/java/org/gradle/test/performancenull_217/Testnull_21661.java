package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21661 {
    private final Productionnull_21661 production = new Productionnull_21661("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}