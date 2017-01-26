package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7199 {
    private final Productionnull_7199 production = new Productionnull_7199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}