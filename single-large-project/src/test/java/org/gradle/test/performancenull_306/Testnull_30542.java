package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30542 {
    private final Productionnull_30542 production = new Productionnull_30542("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}