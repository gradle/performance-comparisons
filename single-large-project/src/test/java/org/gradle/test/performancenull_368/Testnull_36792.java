package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36792 {
    private final Productionnull_36792 production = new Productionnull_36792("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}