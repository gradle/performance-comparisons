package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33919 {
    private final Productionnull_33919 production = new Productionnull_33919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}