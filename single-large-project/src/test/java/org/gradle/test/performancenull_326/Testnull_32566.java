package org.gradle.test.performancenull_326;

import static org.junit.Assert.*;

public class Testnull_32566 {
    private final Productionnull_32566 production = new Productionnull_32566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}