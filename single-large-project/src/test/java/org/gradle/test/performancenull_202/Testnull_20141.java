package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20141 {
    private final Productionnull_20141 production = new Productionnull_20141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}