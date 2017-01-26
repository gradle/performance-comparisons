package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3405 {
    private final Productionnull_3405 production = new Productionnull_3405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}