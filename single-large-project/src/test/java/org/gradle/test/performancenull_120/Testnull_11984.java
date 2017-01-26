package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11984 {
    private final Productionnull_11984 production = new Productionnull_11984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}