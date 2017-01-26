package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_15000 {
    private final Productionnull_15000 production = new Productionnull_15000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}