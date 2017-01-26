package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33002 {
    private final Productionnull_33002 production = new Productionnull_33002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}