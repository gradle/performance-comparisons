package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23961 {
    private final Productionnull_23961 production = new Productionnull_23961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}