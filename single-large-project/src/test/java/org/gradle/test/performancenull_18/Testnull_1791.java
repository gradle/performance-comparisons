package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1791 {
    private final Productionnull_1791 production = new Productionnull_1791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}