package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16931 {
    private final Productionnull_16931 production = new Productionnull_16931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}