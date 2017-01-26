package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2360 {
    private final Productionnull_2360 production = new Productionnull_2360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}