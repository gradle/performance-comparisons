package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11373 {
    private final Productionnull_11373 production = new Productionnull_11373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}