package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11983 {
    private final Productionnull_11983 production = new Productionnull_11983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}