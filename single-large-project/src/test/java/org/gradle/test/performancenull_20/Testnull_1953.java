package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1953 {
    private final Productionnull_1953 production = new Productionnull_1953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}