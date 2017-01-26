package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49082 {
    private final Productionnull_49082 production = new Productionnull_49082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}