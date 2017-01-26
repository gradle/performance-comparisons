package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33089 {
    private final Productionnull_33089 production = new Productionnull_33089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}