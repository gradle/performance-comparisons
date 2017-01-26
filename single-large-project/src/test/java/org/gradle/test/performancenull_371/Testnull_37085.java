package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37085 {
    private final Productionnull_37085 production = new Productionnull_37085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}