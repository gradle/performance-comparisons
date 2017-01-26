package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18672 {
    private final Productionnull_18672 production = new Productionnull_18672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}