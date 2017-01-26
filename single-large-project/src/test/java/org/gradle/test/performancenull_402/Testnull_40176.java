package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40176 {
    private final Productionnull_40176 production = new Productionnull_40176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}