package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3083 {
    private final Productionnull_3083 production = new Productionnull_3083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}