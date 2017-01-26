package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33051 {
    private final Productionnull_33051 production = new Productionnull_33051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}