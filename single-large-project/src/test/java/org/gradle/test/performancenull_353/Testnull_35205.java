package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35205 {
    private final Productionnull_35205 production = new Productionnull_35205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}