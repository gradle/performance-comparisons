package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24681 {
    private final Productionnull_24681 production = new Productionnull_24681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}