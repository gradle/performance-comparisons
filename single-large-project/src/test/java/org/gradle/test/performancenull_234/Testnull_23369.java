package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23369 {
    private final Productionnull_23369 production = new Productionnull_23369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}