package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20118 {
    private final Productionnull_20118 production = new Productionnull_20118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}