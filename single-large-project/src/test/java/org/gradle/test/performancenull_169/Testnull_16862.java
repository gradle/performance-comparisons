package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16862 {
    private final Productionnull_16862 production = new Productionnull_16862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}