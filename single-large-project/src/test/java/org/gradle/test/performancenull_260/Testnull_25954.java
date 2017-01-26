package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25954 {
    private final Productionnull_25954 production = new Productionnull_25954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}