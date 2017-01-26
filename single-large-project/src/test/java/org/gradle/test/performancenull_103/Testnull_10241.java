package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10241 {
    private final Productionnull_10241 production = new Productionnull_10241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}