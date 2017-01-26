package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16075 {
    private final Productionnull_16075 production = new Productionnull_16075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}