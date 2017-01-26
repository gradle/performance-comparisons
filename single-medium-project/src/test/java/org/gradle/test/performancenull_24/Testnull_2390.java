package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2390 {
    private final Productionnull_2390 production = new Productionnull_2390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}