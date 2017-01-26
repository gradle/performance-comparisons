package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22103 {
    private final Productionnull_22103 production = new Productionnull_22103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}