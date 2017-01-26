package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49299 {
    private final Productionnull_49299 production = new Productionnull_49299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}