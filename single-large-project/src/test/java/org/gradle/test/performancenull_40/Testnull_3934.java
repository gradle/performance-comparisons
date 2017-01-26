package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3934 {
    private final Productionnull_3934 production = new Productionnull_3934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}