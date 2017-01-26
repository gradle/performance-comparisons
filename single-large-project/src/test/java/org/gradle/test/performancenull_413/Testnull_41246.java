package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41246 {
    private final Productionnull_41246 production = new Productionnull_41246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}