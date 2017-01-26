package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1958 {
    private final Productionnull_1958 production = new Productionnull_1958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}