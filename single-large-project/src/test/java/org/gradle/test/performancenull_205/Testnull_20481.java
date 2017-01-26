package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20481 {
    private final Productionnull_20481 production = new Productionnull_20481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}