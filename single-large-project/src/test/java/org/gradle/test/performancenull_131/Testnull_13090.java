package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13090 {
    private final Productionnull_13090 production = new Productionnull_13090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}