package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36200 {
    private final Productionnull_36200 production = new Productionnull_36200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}