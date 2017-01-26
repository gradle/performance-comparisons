package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5975 {
    private final Productionnull_5975 production = new Productionnull_5975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}