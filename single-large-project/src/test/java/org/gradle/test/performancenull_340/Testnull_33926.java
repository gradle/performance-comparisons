package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33926 {
    private final Productionnull_33926 production = new Productionnull_33926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}