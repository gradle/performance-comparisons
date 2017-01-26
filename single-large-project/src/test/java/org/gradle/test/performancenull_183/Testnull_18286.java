package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18286 {
    private final Productionnull_18286 production = new Productionnull_18286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}