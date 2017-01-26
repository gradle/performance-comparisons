package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3878 {
    private final Productionnull_3878 production = new Productionnull_3878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}