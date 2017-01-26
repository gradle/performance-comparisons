package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21446 {
    private final Productionnull_21446 production = new Productionnull_21446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}