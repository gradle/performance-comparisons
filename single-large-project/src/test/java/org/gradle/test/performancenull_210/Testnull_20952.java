package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20952 {
    private final Productionnull_20952 production = new Productionnull_20952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}