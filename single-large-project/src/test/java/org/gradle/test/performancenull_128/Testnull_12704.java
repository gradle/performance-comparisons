package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12704 {
    private final Productionnull_12704 production = new Productionnull_12704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}