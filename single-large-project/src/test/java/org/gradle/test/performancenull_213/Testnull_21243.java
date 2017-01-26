package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21243 {
    private final Productionnull_21243 production = new Productionnull_21243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}