package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5977 {
    private final Productionnull_5977 production = new Productionnull_5977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}