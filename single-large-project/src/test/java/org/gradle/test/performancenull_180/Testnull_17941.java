package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17941 {
    private final Productionnull_17941 production = new Productionnull_17941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}