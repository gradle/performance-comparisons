package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40705 {
    private final Productionnull_40705 production = new Productionnull_40705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}