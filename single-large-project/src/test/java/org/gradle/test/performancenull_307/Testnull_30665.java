package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30665 {
    private final Productionnull_30665 production = new Productionnull_30665("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}