package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3909 {
    private final Productionnull_3909 production = new Productionnull_3909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}