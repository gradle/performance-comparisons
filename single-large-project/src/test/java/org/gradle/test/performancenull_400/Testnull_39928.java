package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39928 {
    private final Productionnull_39928 production = new Productionnull_39928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}