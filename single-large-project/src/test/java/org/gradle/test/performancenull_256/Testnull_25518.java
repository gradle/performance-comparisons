package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25518 {
    private final Productionnull_25518 production = new Productionnull_25518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}