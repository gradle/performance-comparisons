package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20981 {
    private final Productionnull_20981 production = new Productionnull_20981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}