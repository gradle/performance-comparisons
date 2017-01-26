package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40068 {
    private final Productionnull_40068 production = new Productionnull_40068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}