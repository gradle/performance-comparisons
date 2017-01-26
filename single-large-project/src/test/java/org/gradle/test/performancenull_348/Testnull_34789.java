package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34789 {
    private final Productionnull_34789 production = new Productionnull_34789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}