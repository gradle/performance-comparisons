package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24149 {
    private final Productionnull_24149 production = new Productionnull_24149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}