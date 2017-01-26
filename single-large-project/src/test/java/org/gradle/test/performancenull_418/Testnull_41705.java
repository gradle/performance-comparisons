package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41705 {
    private final Productionnull_41705 production = new Productionnull_41705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}