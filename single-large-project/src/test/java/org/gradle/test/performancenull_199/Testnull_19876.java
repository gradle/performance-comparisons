package org.gradle.test.performancenull_199;

import static org.junit.Assert.*;

public class Testnull_19876 {
    private final Productionnull_19876 production = new Productionnull_19876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}