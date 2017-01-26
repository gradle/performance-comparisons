package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24300 {
    private final Productionnull_24300 production = new Productionnull_24300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}