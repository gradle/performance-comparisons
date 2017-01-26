package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31403 {
    private final Productionnull_31403 production = new Productionnull_31403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}