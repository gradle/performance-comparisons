package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12441 {
    private final Productionnull_12441 production = new Productionnull_12441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}