package org.gradle.test.performancenull_145;

import static org.junit.Assert.*;

public class Testnull_14435 {
    private final Productionnull_14435 production = new Productionnull_14435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}