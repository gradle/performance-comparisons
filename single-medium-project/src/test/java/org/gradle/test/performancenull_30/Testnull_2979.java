package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2979 {
    private final Productionnull_2979 production = new Productionnull_2979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}