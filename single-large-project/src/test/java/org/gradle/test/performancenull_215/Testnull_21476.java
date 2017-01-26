package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21476 {
    private final Productionnull_21476 production = new Productionnull_21476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}