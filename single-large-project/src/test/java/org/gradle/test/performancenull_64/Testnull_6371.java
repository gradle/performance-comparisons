package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6371 {
    private final Productionnull_6371 production = new Productionnull_6371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}