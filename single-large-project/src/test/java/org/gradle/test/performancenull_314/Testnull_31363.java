package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31363 {
    private final Productionnull_31363 production = new Productionnull_31363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}