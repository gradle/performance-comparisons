package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30006 {
    private final Productionnull_30006 production = new Productionnull_30006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}