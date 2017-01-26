package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7146 {
    private final Productionnull_7146 production = new Productionnull_7146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}