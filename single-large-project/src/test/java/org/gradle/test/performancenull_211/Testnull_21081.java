package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21081 {
    private final Productionnull_21081 production = new Productionnull_21081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}