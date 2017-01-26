package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2198 {
    private final Productionnull_2198 production = new Productionnull_2198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}