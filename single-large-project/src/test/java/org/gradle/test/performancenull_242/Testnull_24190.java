package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24190 {
    private final Productionnull_24190 production = new Productionnull_24190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}