package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20175 {
    private final Productionnull_20175 production = new Productionnull_20175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}