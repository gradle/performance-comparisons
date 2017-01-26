package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14070 {
    private final Productionnull_14070 production = new Productionnull_14070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}