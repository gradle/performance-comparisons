package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3401 {
    private final Productionnull_3401 production = new Productionnull_3401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}