package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49279 {
    private final Productionnull_49279 production = new Productionnull_49279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}