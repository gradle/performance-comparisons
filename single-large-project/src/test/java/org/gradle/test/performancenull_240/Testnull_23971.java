package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23971 {
    private final Productionnull_23971 production = new Productionnull_23971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}