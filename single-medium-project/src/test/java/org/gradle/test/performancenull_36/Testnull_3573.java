package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3573 {
    private final Productionnull_3573 production = new Productionnull_3573("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}