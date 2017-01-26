package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30543 {
    private final Productionnull_30543 production = new Productionnull_30543("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}