package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45375 {
    private final Productionnull_45375 production = new Productionnull_45375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}