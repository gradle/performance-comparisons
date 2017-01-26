package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43979 {
    private final Productionnull_43979 production = new Productionnull_43979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}