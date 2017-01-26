package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4188 {
    private final Productionnull_4188 production = new Productionnull_4188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}