package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1963 {
    private final Productionnull_1963 production = new Productionnull_1963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}