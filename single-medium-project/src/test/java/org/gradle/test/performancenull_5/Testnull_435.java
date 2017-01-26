package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_435 {
    private final Productionnull_435 production = new Productionnull_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}