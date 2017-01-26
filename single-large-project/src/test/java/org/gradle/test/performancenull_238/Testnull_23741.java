package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23741 {
    private final Productionnull_23741 production = new Productionnull_23741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}