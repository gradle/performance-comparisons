package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19979 {
    private final Productionnull_19979 production = new Productionnull_19979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}