package org.gradle.test.performancenull_463;

import static org.junit.Assert.*;

public class Testnull_46282 {
    private final Productionnull_46282 production = new Productionnull_46282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}