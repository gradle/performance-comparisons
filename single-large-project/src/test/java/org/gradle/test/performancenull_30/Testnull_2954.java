package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2954 {
    private final Productionnull_2954 production = new Productionnull_2954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}