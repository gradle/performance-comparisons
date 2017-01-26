package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2951 {
    private final Productionnull_2951 production = new Productionnull_2951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}