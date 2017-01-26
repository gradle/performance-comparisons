package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31905 {
    private final Productionnull_31905 production = new Productionnull_31905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}