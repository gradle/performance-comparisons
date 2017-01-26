package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11998 {
    private final Productionnull_11998 production = new Productionnull_11998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}