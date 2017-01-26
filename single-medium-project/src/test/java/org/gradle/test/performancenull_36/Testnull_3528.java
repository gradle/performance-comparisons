package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3528 {
    private final Productionnull_3528 production = new Productionnull_3528("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}