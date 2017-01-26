package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20133 {
    private final Productionnull_20133 production = new Productionnull_20133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}