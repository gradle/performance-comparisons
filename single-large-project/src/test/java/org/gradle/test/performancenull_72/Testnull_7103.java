package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7103 {
    private final Productionnull_7103 production = new Productionnull_7103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}