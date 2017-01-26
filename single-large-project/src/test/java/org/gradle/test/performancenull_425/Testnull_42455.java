package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42455 {
    private final Productionnull_42455 production = new Productionnull_42455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}