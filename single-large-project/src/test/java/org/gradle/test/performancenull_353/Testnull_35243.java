package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35243 {
    private final Productionnull_35243 production = new Productionnull_35243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}