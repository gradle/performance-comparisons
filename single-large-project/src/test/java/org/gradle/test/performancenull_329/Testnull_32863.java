package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32863 {
    private final Productionnull_32863 production = new Productionnull_32863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}