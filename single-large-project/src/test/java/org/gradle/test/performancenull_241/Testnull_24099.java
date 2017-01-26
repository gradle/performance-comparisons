package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24099 {
    private final Productionnull_24099 production = new Productionnull_24099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}