package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20958 {
    private final Productionnull_20958 production = new Productionnull_20958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}