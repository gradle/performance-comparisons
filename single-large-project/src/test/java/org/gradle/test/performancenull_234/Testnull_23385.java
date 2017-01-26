package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23385 {
    private final Productionnull_23385 production = new Productionnull_23385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}