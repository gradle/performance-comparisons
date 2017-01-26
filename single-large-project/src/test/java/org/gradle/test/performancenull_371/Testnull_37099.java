package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37099 {
    private final Productionnull_37099 production = new Productionnull_37099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}