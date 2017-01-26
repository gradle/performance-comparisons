package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30696 {
    private final Productionnull_30696 production = new Productionnull_30696("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}