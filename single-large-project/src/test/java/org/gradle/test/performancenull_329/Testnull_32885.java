package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32885 {
    private final Productionnull_32885 production = new Productionnull_32885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}