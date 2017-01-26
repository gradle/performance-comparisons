package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23706 {
    private final Productionnull_23706 production = new Productionnull_23706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}