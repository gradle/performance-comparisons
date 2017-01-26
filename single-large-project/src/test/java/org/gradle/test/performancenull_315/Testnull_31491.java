package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31491 {
    private final Productionnull_31491 production = new Productionnull_31491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}