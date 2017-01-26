package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6388 {
    private final Productionnull_6388 production = new Productionnull_6388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}