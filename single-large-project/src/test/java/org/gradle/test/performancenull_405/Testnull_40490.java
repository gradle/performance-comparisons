package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40490 {
    private final Productionnull_40490 production = new Productionnull_40490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}