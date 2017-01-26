package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21210 {
    private final Productionnull_21210 production = new Productionnull_21210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}