package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49986 {
    private final Productionnull_49986 production = new Productionnull_49986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}