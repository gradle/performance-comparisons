package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24042 {
    private final Productionnull_24042 production = new Productionnull_24042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}