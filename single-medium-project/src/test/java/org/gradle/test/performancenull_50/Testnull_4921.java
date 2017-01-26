package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4921 {
    private final Productionnull_4921 production = new Productionnull_4921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}