package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26180 {
    private final Productionnull_26180 production = new Productionnull_26180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}