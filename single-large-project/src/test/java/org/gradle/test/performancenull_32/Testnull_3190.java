package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3190 {
    private final Productionnull_3190 production = new Productionnull_3190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}