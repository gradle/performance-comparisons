package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30001 {
    private final Productionnull_30001 production = new Productionnull_30001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}