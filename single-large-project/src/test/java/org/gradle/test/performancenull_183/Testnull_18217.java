package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18217 {
    private final Productionnull_18217 production = new Productionnull_18217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}