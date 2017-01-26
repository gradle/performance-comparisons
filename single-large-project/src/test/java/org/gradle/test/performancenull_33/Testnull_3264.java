package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3264 {
    private final Productionnull_3264 production = new Productionnull_3264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}