package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3973 {
    private final Productionnull_3973 production = new Productionnull_3973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}