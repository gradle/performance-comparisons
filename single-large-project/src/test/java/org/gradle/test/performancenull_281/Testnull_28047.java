package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28047 {
    private final Productionnull_28047 production = new Productionnull_28047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}