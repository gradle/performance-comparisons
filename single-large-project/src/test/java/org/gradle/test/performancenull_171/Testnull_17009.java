package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17009 {
    private final Productionnull_17009 production = new Productionnull_17009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}