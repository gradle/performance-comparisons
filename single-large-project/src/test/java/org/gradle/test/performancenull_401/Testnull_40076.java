package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40076 {
    private final Productionnull_40076 production = new Productionnull_40076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}