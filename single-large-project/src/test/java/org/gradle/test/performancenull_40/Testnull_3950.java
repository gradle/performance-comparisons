package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3950 {
    private final Productionnull_3950 production = new Productionnull_3950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}