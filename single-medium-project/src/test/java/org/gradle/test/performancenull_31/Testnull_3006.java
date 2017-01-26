package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3006 {
    private final Productionnull_3006 production = new Productionnull_3006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}