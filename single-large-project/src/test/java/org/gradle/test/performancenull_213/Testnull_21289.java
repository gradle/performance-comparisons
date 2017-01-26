package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21289 {
    private final Productionnull_21289 production = new Productionnull_21289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}