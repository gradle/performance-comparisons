package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3413 {
    private final Productionnull_3413 production = new Productionnull_3413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}