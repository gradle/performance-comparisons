package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23350 {
    private final Productionnull_23350 production = new Productionnull_23350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}