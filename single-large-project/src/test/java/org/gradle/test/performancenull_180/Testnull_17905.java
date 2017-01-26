package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17905 {
    private final Productionnull_17905 production = new Productionnull_17905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}