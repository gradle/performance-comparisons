package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22987 {
    private final Productionnull_22987 production = new Productionnull_22987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}