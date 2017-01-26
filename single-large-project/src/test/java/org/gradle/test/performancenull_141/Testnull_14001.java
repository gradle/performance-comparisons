package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14001 {
    private final Productionnull_14001 production = new Productionnull_14001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}