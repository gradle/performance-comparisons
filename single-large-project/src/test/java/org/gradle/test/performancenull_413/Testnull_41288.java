package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41288 {
    private final Productionnull_41288 production = new Productionnull_41288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}