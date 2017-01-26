package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_40000 {
    private final Productionnull_40000 production = new Productionnull_40000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}