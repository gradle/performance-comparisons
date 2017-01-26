package org.gradle.test.performancenull_168;

import static org.junit.Assert.*;

public class Testnull_16789 {
    private final Productionnull_16789 production = new Productionnull_16789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}