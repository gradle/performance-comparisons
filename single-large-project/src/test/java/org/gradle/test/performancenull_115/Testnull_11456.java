package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11456 {
    private final Productionnull_11456 production = new Productionnull_11456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}