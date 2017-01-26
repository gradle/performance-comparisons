package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20108 {
    private final Productionnull_20108 production = new Productionnull_20108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}