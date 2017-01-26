package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16085 {
    private final Productionnull_16085 production = new Productionnull_16085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}