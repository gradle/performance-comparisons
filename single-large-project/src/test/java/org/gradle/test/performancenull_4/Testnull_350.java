package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_350 {
    private final Productionnull_350 production = new Productionnull_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}