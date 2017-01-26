package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41297 {
    private final Productionnull_41297 production = new Productionnull_41297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}