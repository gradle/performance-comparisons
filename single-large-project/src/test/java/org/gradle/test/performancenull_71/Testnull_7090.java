package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7090 {
    private final Productionnull_7090 production = new Productionnull_7090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}