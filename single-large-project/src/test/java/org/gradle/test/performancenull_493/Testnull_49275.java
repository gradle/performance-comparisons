package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49275 {
    private final Productionnull_49275 production = new Productionnull_49275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}