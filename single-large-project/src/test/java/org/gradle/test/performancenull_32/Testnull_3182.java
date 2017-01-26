package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3182 {
    private final Productionnull_3182 production = new Productionnull_3182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}