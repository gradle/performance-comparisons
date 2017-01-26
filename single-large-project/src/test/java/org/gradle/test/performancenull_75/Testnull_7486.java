package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7486 {
    private final Productionnull_7486 production = new Productionnull_7486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}