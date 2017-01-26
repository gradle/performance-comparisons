package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18825 {
    private final Productionnull_18825 production = new Productionnull_18825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}