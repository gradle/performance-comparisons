package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31206 {
    private final Productionnull_31206 production = new Productionnull_31206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}