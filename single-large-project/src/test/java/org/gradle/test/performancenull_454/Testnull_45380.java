package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45380 {
    private final Productionnull_45380 production = new Productionnull_45380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}