package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18091 {
    private final Productionnull_18091 production = new Productionnull_18091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}