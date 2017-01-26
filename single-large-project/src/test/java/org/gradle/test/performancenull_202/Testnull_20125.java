package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20125 {
    private final Productionnull_20125 production = new Productionnull_20125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}