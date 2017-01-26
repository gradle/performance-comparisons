package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49002 {
    private final Productionnull_49002 production = new Productionnull_49002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}