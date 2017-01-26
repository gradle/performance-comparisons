package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20163 {
    private final Productionnull_20163 production = new Productionnull_20163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}