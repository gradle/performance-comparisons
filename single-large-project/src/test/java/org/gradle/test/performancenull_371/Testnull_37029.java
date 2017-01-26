package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37029 {
    private final Productionnull_37029 production = new Productionnull_37029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}