package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5435 {
    private final Productionnull_5435 production = new Productionnull_5435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}