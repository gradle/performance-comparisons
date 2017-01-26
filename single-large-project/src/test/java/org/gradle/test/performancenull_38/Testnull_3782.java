package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3782 {
    private final Productionnull_3782 production = new Productionnull_3782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}