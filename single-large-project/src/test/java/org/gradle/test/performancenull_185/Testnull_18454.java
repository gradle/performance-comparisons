package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18454 {
    private final Productionnull_18454 production = new Productionnull_18454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}