package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20150 {
    private final Productionnull_20150 production = new Productionnull_20150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}