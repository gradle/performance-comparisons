package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13454 {
    private final Productionnull_13454 production = new Productionnull_13454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}