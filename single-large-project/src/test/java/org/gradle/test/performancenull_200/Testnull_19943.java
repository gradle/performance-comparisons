package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19943 {
    private final Productionnull_19943 production = new Productionnull_19943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}