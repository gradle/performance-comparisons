package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2958 {
    private final Productionnull_2958 production = new Productionnull_2958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}