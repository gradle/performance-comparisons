package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25054 {
    private final Productionnull_25054 production = new Productionnull_25054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}