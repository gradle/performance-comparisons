package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3916 {
    private final Productionnull_3916 production = new Productionnull_3916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}