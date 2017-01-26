package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33062 {
    private final Productionnull_33062 production = new Productionnull_33062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}