package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20039 {
    private final Productionnull_20039 production = new Productionnull_20039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}