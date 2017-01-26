package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33004 {
    private final Productionnull_33004 production = new Productionnull_33004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}