package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2185 {
    private final Productionnull_2185 production = new Productionnull_2185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}