package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4462 {
    private final Productionnull_4462 production = new Productionnull_4462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}