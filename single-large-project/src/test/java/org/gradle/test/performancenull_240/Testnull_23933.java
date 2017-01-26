package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23933 {
    private final Productionnull_23933 production = new Productionnull_23933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}