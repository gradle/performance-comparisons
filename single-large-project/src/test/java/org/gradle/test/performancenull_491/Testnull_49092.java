package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49092 {
    private final Productionnull_49092 production = new Productionnull_49092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}