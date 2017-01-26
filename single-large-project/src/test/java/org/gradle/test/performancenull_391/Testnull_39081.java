package org.gradle.test.performancenull_391;

import static org.junit.Assert.*;

public class Testnull_39081 {
    private final Productionnull_39081 production = new Productionnull_39081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}