package org.gradle.test.performancenull_155;

import static org.junit.Assert.*;

public class Testnull_15443 {
    private final Productionnull_15443 production = new Productionnull_15443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}