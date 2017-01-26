package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6083 {
    private final Productionnull_6083 production = new Productionnull_6083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}