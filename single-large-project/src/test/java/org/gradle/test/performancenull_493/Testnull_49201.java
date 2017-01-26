package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49201 {
    private final Productionnull_49201 production = new Productionnull_49201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}