package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_380 {
    private final Productionnull_380 production = new Productionnull_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}