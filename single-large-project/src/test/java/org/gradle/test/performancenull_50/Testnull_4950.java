package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4950 {
    private final Productionnull_4950 production = new Productionnull_4950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}