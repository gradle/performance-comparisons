package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49288 {
    private final Productionnull_49288 production = new Productionnull_49288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}