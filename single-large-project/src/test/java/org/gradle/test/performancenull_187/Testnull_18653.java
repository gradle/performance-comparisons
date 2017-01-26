package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18653 {
    private final Productionnull_18653 production = new Productionnull_18653("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}