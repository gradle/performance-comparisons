package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31470 {
    private final Productionnull_31470 production = new Productionnull_31470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}