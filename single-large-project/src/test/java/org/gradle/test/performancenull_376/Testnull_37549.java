package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37549 {
    private final Productionnull_37549 production = new Productionnull_37549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}