package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40199 {
    private final Productionnull_40199 production = new Productionnull_40199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}