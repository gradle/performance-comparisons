package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7186 {
    private final Productionnull_7186 production = new Productionnull_7186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}