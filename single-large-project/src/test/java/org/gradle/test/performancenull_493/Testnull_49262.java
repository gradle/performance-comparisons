package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49262 {
    private final Productionnull_49262 production = new Productionnull_49262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}