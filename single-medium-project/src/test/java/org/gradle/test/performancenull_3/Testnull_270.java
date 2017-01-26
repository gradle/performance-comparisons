package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_270 {
    private final Productionnull_270 production = new Productionnull_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}