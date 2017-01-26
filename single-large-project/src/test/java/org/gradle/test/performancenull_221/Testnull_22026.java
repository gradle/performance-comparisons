package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22026 {
    private final Productionnull_22026 production = new Productionnull_22026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}