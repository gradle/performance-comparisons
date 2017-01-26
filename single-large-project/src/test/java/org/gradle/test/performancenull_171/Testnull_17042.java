package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17042 {
    private final Productionnull_17042 production = new Productionnull_17042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}