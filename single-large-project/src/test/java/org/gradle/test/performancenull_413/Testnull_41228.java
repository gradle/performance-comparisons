package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41228 {
    private final Productionnull_41228 production = new Productionnull_41228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}