package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20463 {
    private final Productionnull_20463 production = new Productionnull_20463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}