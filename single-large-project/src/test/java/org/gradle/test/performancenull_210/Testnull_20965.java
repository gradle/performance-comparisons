package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20965 {
    private final Productionnull_20965 production = new Productionnull_20965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}