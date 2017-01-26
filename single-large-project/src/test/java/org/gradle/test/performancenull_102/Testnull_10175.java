package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10175 {
    private final Productionnull_10175 production = new Productionnull_10175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}