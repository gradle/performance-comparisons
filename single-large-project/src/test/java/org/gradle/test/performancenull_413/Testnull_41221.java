package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41221 {
    private final Productionnull_41221 production = new Productionnull_41221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}