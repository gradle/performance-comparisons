package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_360 {
    private final Productionnull_360 production = new Productionnull_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}