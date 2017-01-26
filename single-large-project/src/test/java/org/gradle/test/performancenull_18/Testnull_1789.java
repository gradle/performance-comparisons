package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1789 {
    private final Productionnull_1789 production = new Productionnull_1789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}