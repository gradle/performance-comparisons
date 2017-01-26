package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36146 {
    private final Productionnull_36146 production = new Productionnull_36146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}