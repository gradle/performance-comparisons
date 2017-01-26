package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7135 {
    private final Productionnull_7135 production = new Productionnull_7135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}