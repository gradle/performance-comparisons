package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4190 {
    private final Productionnull_4190 production = new Productionnull_4190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}