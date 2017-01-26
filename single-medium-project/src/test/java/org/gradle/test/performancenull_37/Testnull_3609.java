package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3609 {
    private final Productionnull_3609 production = new Productionnull_3609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}