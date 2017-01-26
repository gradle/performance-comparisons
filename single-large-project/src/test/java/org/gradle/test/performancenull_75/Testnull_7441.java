package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7441 {
    private final Productionnull_7441 production = new Productionnull_7441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}