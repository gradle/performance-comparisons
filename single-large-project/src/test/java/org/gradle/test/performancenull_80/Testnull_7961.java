package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7961 {
    private final Productionnull_7961 production = new Productionnull_7961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}