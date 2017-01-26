package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4789 {
    private final Productionnull_4789 production = new Productionnull_4789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}