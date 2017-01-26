package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40011 {
    private final Productionnull_40011 production = new Productionnull_40011("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}