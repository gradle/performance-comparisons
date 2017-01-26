package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34793 {
    private final Productionnull_34793 production = new Productionnull_34793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}