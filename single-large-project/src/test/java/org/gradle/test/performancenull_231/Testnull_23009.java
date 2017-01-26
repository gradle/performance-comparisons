package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23009 {
    private final Productionnull_23009 production = new Productionnull_23009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}