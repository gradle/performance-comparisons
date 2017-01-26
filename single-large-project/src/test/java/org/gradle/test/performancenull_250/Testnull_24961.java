package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24961 {
    private final Productionnull_24961 production = new Productionnull_24961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}