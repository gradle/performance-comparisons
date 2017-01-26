package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17443 {
    private final Productionnull_17443 production = new Productionnull_17443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}