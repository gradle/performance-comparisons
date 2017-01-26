package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1205 {
    private final Productionnull_1205 production = new Productionnull_1205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}