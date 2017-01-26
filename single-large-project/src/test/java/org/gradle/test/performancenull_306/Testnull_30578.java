package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30578 {
    private final Productionnull_30578 production = new Productionnull_30578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}