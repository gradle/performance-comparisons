package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3520 {
    private final Productionnull_3520 production = new Productionnull_3520("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}