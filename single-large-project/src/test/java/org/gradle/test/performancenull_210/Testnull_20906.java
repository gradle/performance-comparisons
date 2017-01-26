package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20906 {
    private final Productionnull_20906 production = new Productionnull_20906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}