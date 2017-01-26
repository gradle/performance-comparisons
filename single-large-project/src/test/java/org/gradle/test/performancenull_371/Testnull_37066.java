package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37066 {
    private final Productionnull_37066 production = new Productionnull_37066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}