package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20177 {
    private final Productionnull_20177 production = new Productionnull_20177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}