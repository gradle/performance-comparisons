package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24032 {
    private final Productionnull_24032 production = new Productionnull_24032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}