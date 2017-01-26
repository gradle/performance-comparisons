package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20986 {
    private final Productionnull_20986 production = new Productionnull_20986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}