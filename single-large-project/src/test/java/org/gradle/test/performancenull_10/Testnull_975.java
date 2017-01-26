package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_975 {
    private final Productionnull_975 production = new Productionnull_975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}