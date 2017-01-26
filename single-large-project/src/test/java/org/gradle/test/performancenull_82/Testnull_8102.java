package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8102 {
    private final Productionnull_8102 production = new Productionnull_8102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}