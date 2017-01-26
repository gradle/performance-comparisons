package org.gradle.test.performancenull_8;

import static org.junit.Assert.*;

public class Testnull_785 {
    private final Productionnull_785 production = new Productionnull_785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}