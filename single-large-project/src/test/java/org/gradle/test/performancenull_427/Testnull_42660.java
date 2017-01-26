package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42660 {
    private final Productionnull_42660 production = new Productionnull_42660("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}