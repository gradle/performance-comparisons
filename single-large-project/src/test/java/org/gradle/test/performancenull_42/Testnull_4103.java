package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4103 {
    private final Productionnull_4103 production = new Productionnull_4103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}