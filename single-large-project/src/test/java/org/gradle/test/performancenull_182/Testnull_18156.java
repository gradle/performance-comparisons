package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18156 {
    private final Productionnull_18156 production = new Productionnull_18156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}