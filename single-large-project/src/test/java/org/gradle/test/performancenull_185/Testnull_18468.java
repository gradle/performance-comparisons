package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18468 {
    private final Productionnull_18468 production = new Productionnull_18468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}