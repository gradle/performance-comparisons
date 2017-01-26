package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37089 {
    private final Productionnull_37089 production = new Productionnull_37089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}