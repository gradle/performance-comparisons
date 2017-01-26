package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5058 {
    private final Productionnull_5058 production = new Productionnull_5058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}