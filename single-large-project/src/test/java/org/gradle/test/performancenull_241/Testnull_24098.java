package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24098 {
    private final Productionnull_24098 production = new Productionnull_24098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}