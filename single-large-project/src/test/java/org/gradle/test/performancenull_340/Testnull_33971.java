package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33971 {
    private final Productionnull_33971 production = new Productionnull_33971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}