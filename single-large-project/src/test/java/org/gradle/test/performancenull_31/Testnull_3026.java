package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3026 {
    private final Productionnull_3026 production = new Productionnull_3026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}