package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25029 {
    private final Productionnull_25029 production = new Productionnull_25029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}