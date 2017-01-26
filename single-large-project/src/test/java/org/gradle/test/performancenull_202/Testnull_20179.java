package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20179 {
    private final Productionnull_20179 production = new Productionnull_20179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}