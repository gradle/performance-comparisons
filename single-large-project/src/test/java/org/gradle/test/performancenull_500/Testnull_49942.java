package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49942 {
    private final Productionnull_49942 production = new Productionnull_49942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}