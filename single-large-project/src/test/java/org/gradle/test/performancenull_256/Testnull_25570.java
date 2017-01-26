package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25570 {
    private final Productionnull_25570 production = new Productionnull_25570("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}