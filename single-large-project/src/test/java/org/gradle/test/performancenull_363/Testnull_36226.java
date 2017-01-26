package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36226 {
    private final Productionnull_36226 production = new Productionnull_36226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}