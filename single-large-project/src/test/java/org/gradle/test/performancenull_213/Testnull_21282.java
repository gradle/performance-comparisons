package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21282 {
    private final Productionnull_21282 production = new Productionnull_21282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}