package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37150 {
    private final Productionnull_37150 production = new Productionnull_37150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}