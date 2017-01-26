package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19936 {
    private final Productionnull_19936 production = new Productionnull_19936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}