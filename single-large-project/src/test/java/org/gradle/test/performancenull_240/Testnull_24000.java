package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_24000 {
    private final Productionnull_24000 production = new Productionnull_24000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}