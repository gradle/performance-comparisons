package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24091 {
    private final Productionnull_24091 production = new Productionnull_24091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}