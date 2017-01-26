package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21054 {
    private final Productionnull_21054 production = new Productionnull_21054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}