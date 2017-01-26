package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40202 {
    private final Productionnull_40202 production = new Productionnull_40202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}