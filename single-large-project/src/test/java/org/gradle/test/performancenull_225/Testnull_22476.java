package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22476 {
    private final Productionnull_22476 production = new Productionnull_22476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}