package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2401 {
    private final Productionnull_2401 production = new Productionnull_2401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}