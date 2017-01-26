package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4786 {
    private final Productionnull_4786 production = new Productionnull_4786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}