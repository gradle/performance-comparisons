package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37001 {
    private final Productionnull_37001 production = new Productionnull_37001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}