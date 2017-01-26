package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3791 {
    private final Productionnull_3791 production = new Productionnull_3791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}