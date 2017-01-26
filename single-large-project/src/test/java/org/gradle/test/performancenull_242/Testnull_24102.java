package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24102 {
    private final Productionnull_24102 production = new Productionnull_24102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}