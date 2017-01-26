package org.gradle.test.performancenull_288;

import static org.junit.Assert.*;

public class Testnull_28793 {
    private final Productionnull_28793 production = new Productionnull_28793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}