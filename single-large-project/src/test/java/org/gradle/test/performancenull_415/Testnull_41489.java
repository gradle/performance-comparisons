package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41489 {
    private final Productionnull_41489 production = new Productionnull_41489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}