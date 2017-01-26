package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37063 {
    private final Productionnull_37063 production = new Productionnull_37063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}