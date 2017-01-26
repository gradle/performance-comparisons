package org.gradle.test.performancenull_395;

import static org.junit.Assert.*;

public class Testnull_39481 {
    private final Productionnull_39481 production = new Productionnull_39481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}