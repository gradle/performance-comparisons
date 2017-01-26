package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3084 {
    private final Productionnull_3084 production = new Productionnull_3084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}