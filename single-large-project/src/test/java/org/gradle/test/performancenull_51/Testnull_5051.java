package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5051 {
    private final Productionnull_5051 production = new Productionnull_5051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}