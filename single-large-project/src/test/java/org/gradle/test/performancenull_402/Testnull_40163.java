package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40163 {
    private final Productionnull_40163 production = new Productionnull_40163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}