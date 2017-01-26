package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18448 {
    private final Productionnull_18448 production = new Productionnull_18448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}