package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24068 {
    private final Productionnull_24068 production = new Productionnull_24068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}