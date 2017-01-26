package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8956 {
    private final Productionnull_8956 production = new Productionnull_8956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}