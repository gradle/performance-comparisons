package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6202 {
    private final Productionnull_6202 production = new Productionnull_6202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}