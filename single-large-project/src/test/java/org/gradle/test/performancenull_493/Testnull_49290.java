package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49290 {
    private final Productionnull_49290 production = new Productionnull_49290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}