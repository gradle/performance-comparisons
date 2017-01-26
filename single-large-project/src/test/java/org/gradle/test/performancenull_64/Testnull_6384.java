package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6384 {
    private final Productionnull_6384 production = new Productionnull_6384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}