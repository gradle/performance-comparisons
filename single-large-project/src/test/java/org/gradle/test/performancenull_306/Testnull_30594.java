package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30594 {
    private final Productionnull_30594 production = new Productionnull_30594("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}