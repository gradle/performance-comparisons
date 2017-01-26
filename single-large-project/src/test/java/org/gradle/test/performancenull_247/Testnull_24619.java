package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24619 {
    private final Productionnull_24619 production = new Productionnull_24619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}