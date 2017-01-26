package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18622 {
    private final Productionnull_18622 production = new Productionnull_18622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}