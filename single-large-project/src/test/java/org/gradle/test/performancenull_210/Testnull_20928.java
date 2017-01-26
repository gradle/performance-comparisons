package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20928 {
    private final Productionnull_20928 production = new Productionnull_20928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}