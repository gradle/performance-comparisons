package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35271 {
    private final Productionnull_35271 production = new Productionnull_35271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}