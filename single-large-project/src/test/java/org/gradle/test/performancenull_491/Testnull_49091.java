package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49091 {
    private final Productionnull_49091 production = new Productionnull_49091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}