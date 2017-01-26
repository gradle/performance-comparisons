package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6187 {
    private final Productionnull_6187 production = new Productionnull_6187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}