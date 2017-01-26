package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30563 {
    private final Productionnull_30563 production = new Productionnull_30563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}