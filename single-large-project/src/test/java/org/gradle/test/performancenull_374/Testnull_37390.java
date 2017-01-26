package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37390 {
    private final Productionnull_37390 production = new Productionnull_37390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}