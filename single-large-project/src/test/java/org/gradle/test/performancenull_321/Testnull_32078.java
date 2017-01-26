package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32078 {
    private final Productionnull_32078 production = new Productionnull_32078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}