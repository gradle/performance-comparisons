package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19934 {
    private final Productionnull_19934 production = new Productionnull_19934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}