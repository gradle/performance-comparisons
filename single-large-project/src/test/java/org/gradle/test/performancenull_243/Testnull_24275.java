package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24275 {
    private final Productionnull_24275 production = new Productionnull_24275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}