package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41209 {
    private final Productionnull_41209 production = new Productionnull_41209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}