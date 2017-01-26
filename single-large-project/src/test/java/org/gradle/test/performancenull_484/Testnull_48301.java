package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48301 {
    private final Productionnull_48301 production = new Productionnull_48301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}