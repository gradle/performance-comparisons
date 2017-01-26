package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24072 {
    private final Productionnull_24072 production = new Productionnull_24072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}