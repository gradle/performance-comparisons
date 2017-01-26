package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18249 {
    private final Productionnull_18249 production = new Productionnull_18249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}