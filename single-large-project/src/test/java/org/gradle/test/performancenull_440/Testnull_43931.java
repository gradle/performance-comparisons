package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43931 {
    private final Productionnull_43931 production = new Productionnull_43931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}