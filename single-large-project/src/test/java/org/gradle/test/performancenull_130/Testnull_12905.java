package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12905 {
    private final Productionnull_12905 production = new Productionnull_12905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}