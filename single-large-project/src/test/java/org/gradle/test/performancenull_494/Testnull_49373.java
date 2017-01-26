package org.gradle.test.performancenull_494;

import static org.junit.Assert.*;

public class Testnull_49373 {
    private final Productionnull_49373 production = new Productionnull_49373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}