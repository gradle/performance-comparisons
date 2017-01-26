package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31926 {
    private final Productionnull_31926 production = new Productionnull_31926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}