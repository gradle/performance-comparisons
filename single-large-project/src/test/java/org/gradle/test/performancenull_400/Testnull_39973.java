package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39973 {
    private final Productionnull_39973 production = new Productionnull_39973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}