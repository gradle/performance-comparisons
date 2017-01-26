package org.gradle.test.performancenull_490;

import static org.junit.Assert.*;

public class Testnull_49000 {
    private final Productionnull_49000 production = new Productionnull_49000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}