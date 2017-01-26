package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32431 {
    private final Productionnull_32431 production = new Productionnull_32431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}