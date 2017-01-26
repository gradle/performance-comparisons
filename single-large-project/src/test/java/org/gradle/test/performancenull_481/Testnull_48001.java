package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48001 {
    private final Productionnull_48001 production = new Productionnull_48001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}