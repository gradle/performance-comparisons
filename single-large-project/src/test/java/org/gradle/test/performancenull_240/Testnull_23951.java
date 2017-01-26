package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23951 {
    private final Productionnull_23951 production = new Productionnull_23951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}