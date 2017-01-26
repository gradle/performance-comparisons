package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24043 {
    private final Productionnull_24043 production = new Productionnull_24043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}