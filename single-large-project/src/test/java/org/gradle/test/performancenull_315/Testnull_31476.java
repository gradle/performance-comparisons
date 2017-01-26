package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31476 {
    private final Productionnull_31476 production = new Productionnull_31476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}