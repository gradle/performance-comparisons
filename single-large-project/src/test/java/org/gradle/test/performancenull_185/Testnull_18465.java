package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18465 {
    private final Productionnull_18465 production = new Productionnull_18465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}