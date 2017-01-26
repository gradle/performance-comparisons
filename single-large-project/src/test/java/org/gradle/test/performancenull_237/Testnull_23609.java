package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23609 {
    private final Productionnull_23609 production = new Productionnull_23609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}