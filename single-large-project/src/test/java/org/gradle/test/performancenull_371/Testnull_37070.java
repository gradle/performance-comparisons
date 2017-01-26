package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37070 {
    private final Productionnull_37070 production = new Productionnull_37070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}