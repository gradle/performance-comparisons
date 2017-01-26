package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40195 {
    private final Productionnull_40195 production = new Productionnull_40195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}