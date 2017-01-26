package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30523 {
    private final Productionnull_30523 production = new Productionnull_30523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}