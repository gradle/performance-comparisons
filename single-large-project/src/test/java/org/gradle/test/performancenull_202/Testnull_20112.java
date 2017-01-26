package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20112 {
    private final Productionnull_20112 production = new Productionnull_20112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}