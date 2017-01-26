package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2283 {
    private final Productionnull_2283 production = new Productionnull_2283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}