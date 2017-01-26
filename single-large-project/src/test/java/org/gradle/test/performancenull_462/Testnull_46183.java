package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46183 {
    private final Productionnull_46183 production = new Productionnull_46183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}