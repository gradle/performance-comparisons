package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20023 {
    private final Productionnull_20023 production = new Productionnull_20023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}