package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5233 {
    private final Productionnull_5233 production = new Productionnull_5233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}