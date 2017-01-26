package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20169 {
    private final Productionnull_20169 production = new Productionnull_20169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}