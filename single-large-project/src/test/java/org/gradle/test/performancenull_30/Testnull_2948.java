package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2948 {
    private final Productionnull_2948 production = new Productionnull_2948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}