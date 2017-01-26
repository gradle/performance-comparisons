package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34002 {
    private final Productionnull_34002 production = new Productionnull_34002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}