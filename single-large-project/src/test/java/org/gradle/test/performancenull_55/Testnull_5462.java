package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5462 {
    private final Productionnull_5462 production = new Productionnull_5462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}