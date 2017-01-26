package org.gradle.test.performancenull_463;

import static org.junit.Assert.*;

public class Testnull_46281 {
    private final Productionnull_46281 production = new Productionnull_46281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}