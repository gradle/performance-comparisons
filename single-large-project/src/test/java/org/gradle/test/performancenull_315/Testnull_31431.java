package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31431 {
    private final Productionnull_31431 production = new Productionnull_31431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}