package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49979 {
    private final Productionnull_49979 production = new Productionnull_49979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}