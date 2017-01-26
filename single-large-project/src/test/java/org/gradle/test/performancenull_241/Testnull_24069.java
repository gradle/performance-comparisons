package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24069 {
    private final Productionnull_24069 production = new Productionnull_24069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}