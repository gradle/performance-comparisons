package org.gradle.test.performancenull_86;

import static org.junit.Assert.*;

public class Testnull_8531 {
    private final Productionnull_8531 production = new Productionnull_8531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}