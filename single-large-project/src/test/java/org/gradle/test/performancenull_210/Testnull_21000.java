package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_21000 {
    private final Productionnull_21000 production = new Productionnull_21000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}