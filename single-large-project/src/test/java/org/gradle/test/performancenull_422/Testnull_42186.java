package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42186 {
    private final Productionnull_42186 production = new Productionnull_42186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}