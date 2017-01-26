package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30598 {
    private final Productionnull_30598 production = new Productionnull_30598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}