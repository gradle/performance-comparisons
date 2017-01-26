package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3789 {
    private final Productionnull_3789 production = new Productionnull_3789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}