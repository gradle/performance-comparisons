package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49977 {
    private final Productionnull_49977 production = new Productionnull_49977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}