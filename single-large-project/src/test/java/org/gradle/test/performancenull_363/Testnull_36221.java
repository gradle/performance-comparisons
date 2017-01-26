package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36221 {
    private final Productionnull_36221 production = new Productionnull_36221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}