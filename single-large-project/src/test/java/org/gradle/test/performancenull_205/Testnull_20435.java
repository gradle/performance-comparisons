package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20435 {
    private final Productionnull_20435 production = new Productionnull_20435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}